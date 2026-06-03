package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.vik.easy.TwoSum.twoSum;

public class TwoSumTest {

    @DataProvider(name = "twoSumDataProvider")
    public Object[][] inputData() {
        int[] nums = {2,7,11,15}; int target = 9; int[] ans = {0, 1};
        int[] nums1 = {3, 2, 4}; int target1 = 6; int[] ans1 = {1, 2};
        int[] nums2 = {3, 3}; int target2 = 6; int[] ans2 = {0, 1};
        Object[][] data = {
                {nums, target, ans},
                {nums1, target1, ans1},
                {nums2, target2, ans2},
        };

        return data;
    }

    @Test(dataProvider = "twoSumDataProvider")
    public void twoSumTest(int[] nums, int target, int[] ans) {
//        System.out.println(nums.toString() + " : " + target + " : " + ans.toString());
        Assert.assertEquals(TwoSum.twoSum(nums, target), ans);
    }

}
