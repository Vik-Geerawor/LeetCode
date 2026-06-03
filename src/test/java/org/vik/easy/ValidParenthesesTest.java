package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.ValidParentheses.isValid;

public class ValidParenthesesTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {
        Object[][] data = {
                {"", false},
                {"(", false},
                {"){[]})", false},
                {"({[]}))", false},
                {"({})", true},
                {"{}([]){([])}", true},
                {"{}([]){([})}", false},
                {"({})}{", false},
                {"[[[]", false}
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void isValidTest(String s, boolean result) {
        Assert.assertEquals(isValid(s), result);
    }
}
