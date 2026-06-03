package org.vik.easy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {
        Object[][] data = {
                {"00", "01", "x"},
                {"10", "11", "y"}
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")      // name of dataprovider
    @Parameters({"a", "b", "c"})
    public void dataproviderTest(String a, String b, String c) {
        System.out.println(a + " : " + b + " : " + c);
    }
}
