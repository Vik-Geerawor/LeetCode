package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.PalindromeNumber.isPalindrome;

public class PalindromeNumberTest {

    @DataProvider(name = "myDataProvider")
    Object[][] getData() {

        Object[][] data = {
                {121, true},
                {-121, false},
                {10, false},
                {1234567899, false},
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void isPalindromeTest(int x, boolean r) {
        Assert.assertEquals(isPalindrome(x), r);
    }
}
