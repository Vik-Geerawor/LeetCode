package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.vik.easy.LastWord.lengthOfLastWord;

public class LastWordTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {

        String s1 = "Hello World"; int k1 = 5;
        String s2 = "   fly me   to   the moon  "; int k2 = 4;
        String s3 = "luffy is still joyboy        "; int k3 = 6;

        Object[][] data = {
                {s1, k1},
                {s2, k2},
                {s3, k3},
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void lengthOfLastWordTest(String s, int k) {
        Assert.assertEquals(lengthOfLastWord(s), k);
    }
}
