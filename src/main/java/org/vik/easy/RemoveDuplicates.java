package org.vik.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        return removeDuplicatesV2(nums);
    }

    public static int removeDuplicatesV1(int[] nums) {

        int k = 0;
        int initSize = nums.length;

        int[] distinctNums = Arrays.stream(nums).distinct()
                .toArray();

        k = distinctNums.length;

        System.out.println("init size: " + initSize);
        System.out.println("final size: " + k);

        int[] finalNums = new int[initSize];

        for (int i = 0; i < initSize; i++) {
            if (i < k) {
                finalNums[i] = distinctNums[i];
            } else {
                finalNums[i] = -1;
            }
        }

        return k;
    }

    public static int removeDuplicatesV2(int[] nums) {
        /**
         * in-place substitution
         */

        int k = 0;
        int initSize = nums.length;

        int i = 0;
        int j = 1;
        int counter = 0;
        while (i < initSize) {
            while (j < initSize && nums[i] == nums[j]) {
                nums[j] = 300;      // outside valid values
                counter++;
                j++;                // repeat if next value is the same
            }

            // move forward
            i = j;
            j++;
        }

        Arrays.sort(nums);
        k = initSize - counter;

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 5, 5, 7, 8};

        int k = removeDuplicatesV2(nums);
        System.out.println("k = " + k);

        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }
}
