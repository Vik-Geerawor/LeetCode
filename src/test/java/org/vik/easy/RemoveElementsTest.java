package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.RemoveElement.removeElement;

public class RemoveElementsTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {

        int[] nums1 = {3,2,2,3}; int val1 = 3; int k1 = 2;
        int[] nums2 = {0,1,2,2,3,0,4,2}; int val2 = 2; int k2 = 5;

        Object[][] data = {
                {nums1, val1, k1},
                {nums2, val2, k2},
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void removeElementTest(int[] nums, int val, int k) {

        Assert.assertEquals(removeElement(nums, val), k);
    }
}
