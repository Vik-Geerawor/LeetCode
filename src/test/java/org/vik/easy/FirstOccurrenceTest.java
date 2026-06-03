package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.FirstOccurrence.strStr;

public class FirstOccurrenceTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {

        String haystack1 = "sadbutsad"; String needle1 = "sad"; int k1 = 0;
        String haystack2 = "badsadbutsad"; String needle2 = "sad"; int k2 = 3;
        String haystack3 = "leetcode"; String needle3 = "leeto"; int k3 = -1;

        Object[][] data = {
                {haystack1, needle1, k1},
                {haystack2, needle2, k2},
                {haystack3, needle3, k3}
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void strStrTest(String haystack, String needle, int k) {
        Assert.assertEquals(strStr(haystack, needle), k);
    }
}
