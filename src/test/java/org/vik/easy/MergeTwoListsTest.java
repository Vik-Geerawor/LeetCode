package org.vik.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.vik.easy.MergeTwoLists.makeNodes;
import static org.vik.easy.MergeTwoLists.mergeTwoLists;

public class MergeTwoListsTest {

    @DataProvider(name = "myDataProvider")
    public Object[][] getData() {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,3,4));
        ArrayList<Integer> result = new ArrayList<>(List.of(1,2,3,4,4));

        Object[][] data = {
                {makeNodes(list1), makeNodes(list2), makeNodes(result)},
        };

        return data;
    }

    @Test(dataProvider = "myDataProvider")
    public void mergeTwoListsTest(ListNode list1, ListNode list2, ListNode result) {
        Assert.assertEquals(mergeTwoLists(list1, list2), result);       // requires more effort for a good test
    }
}
