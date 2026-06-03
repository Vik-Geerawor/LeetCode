package org.vik.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        return removeElementV1(nums, val);
    }

    public static int removeElementV1(int[] nums, int val) {

        int k = 0;

        int i = 0;
        int counter = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                nums[i] = 300;      // invalid value
                counter++;
            }

            i++;
        }

        Arrays.sort(nums);

        k = nums.length - counter;

        return k;
    }

    public static void main(String[] args) {

//        int[] nums = {3, 2, 2, 3}; int val = 3;
        int[] nums = {0,1,2,2,3,0,4,2}; int val = 2;

        int k = removeElement(nums, val);
        System.out.println("K = " + k);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
