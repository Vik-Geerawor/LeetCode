package org.vik.easy;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {

        return searchInsertV2(nums, target);
    }


    public static int searchInsertV2(int[] nums, int target) {

        // target less that first element
        if (nums[0] > target) {
            return 0;
        }

        int k = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                k = i;
                break;
            }
        }

        // target not found
        if (k == -1) {
            k = nums.length;
        }

        return k;
    }

    public static void main(String[] args) {

//        int[] nums = {1,3,5,6}; int target = 5;
//        int[] nums = {1,3,5,6}; int target = 2;
        int[] nums = {1,3,5,6}; int target = 7;

        int k = searchInsert(nums, target);
        System.out.println(k);
    }
}
