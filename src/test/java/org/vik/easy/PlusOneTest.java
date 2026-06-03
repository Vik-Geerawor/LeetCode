package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.PlusOne.plusOne;

public class PlusOneTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {

        int[] digits1 = {1,2,3}; int[] result1 = {1,2,4};
        int[] digits2  = {4,3,2,1}; int[] result2  = {4,3,2,2};
        int[] digits3 = {1,9,9}; int[] result3 = {2,0,0};
        int[] digits4 = {9,9,9}; int[] result4 = {1,0,0,0};

        Object[][] data = {
                {digits1, result1},
                {digits2, result2},
                {digits3, result3},
                {digits4, result4},
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void plusOneTest(int[] digits, int[] result) {
        Assert.assertEquals(plusOne(digits), result);
    }
}
