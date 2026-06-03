package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.RemoveDuplicates.removeDuplicates;

public class RemoveDuplicatesTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {
        int[] nums = {1, 2, 2, 3, 4, 5, 5, 7, 8}; int k = 7;
        Object[][] data = {
                {nums, k}
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void removeDuplicatesTest(int[] nums, int k) {
        Assert.assertEquals(removeDuplicates(nums), k);
    }
}
