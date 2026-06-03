package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.SearchInsert.searchInsert;

public class SearchInsertTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {

        int[] nums1 = {1,3,5,6}; int target1 = 5; int k1 = 2;
        int[] nums2 = {1,3,5,6}; int target2 = 2; int k2 = 1;
        int[] nums3 = {1,3,5,6}; int target3 = 7; int k3 = 4;
        int[] nums4 = {1,3,5,6}; int target4 = 0; int k4 = 0;

        Object[][] data = {
                {nums1, target1, k1},
                {nums2, target2, k2},
                {nums3, target3, k3},
                {nums4, target4, k4},
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void searchInsertTest(int[] nums, int target, int k) {
        Assert.assertEquals(searchInsert(nums, target), k);
    }
}
