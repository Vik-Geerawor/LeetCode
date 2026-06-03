package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.LongestCommonPrefix.longestCommonPrefix;

public class LongestCommonPrefixTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {
        String[] strs1 = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        String[] strs3 = {"converse","convict","conversation"};
        String[] strs4 = {"ab", "a"};
        String[] strs5 = {"a", ""};
        String[] strs6 = {"a"};
        String[] strs7 = {"flower","flower","flower"};
        String[] strs8 = {"a","b"};

        Object[][] data = {
                {strs1, "fl"},
                {strs2, ""},
                {strs3, "conv"},
                {strs4, "a"},
                {strs5, ""},
                {strs6, "a"},
                {strs7, "flower"},
                {strs8, ""},
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void longestCommonPrefixTest(String[] strs, String result) {
        Assert.assertEquals(longestCommonPrefix(strs), result);
    }
}
