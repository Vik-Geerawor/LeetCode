package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.RomanToInteger.romanToInt;

public class RomanToIntegerTest {

    @DataProvider(name = "myDataProvider")
    Object[][] getData() {
        Object[][] data = {
                {"III", 3},
                {"LVIII", 58},
                {"MCMXCIV", 1994}
        };
        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void romanToIntTest(String s, int result) {
        Assert.assertEquals(romanToInt(s), result);
    }
}
