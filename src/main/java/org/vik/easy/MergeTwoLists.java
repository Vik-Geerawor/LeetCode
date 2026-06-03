package org.vik.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoLists {

    public static void run() {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,3,4));

//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();

        ListNode myNodes = mergeTwoLists(makeNodes(list1), makeNodes(list2));

        printNodes(myNodes);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // empty lists
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 != null && list2 == null) {
            return list1;
        } else if (list1 == null && list2 != null) {
            return list2;
        }

        ArrayList<Integer> values = getValues(list1);
        values.addAll(getValues(list2));

        values.sort(Integer::compareTo);

        ListNode myNodes = makeNodes(values);

        return myNodes;
    }



    public static ListNode makeNodes(ArrayList<Integer> list) {

        if (list.isEmpty()) {
            return null;
        }

        ListNode head = new ListNode(list.getFirst());
        ListNode lastNode = head;

        for (int i = 1; i < list.size(); i++) {
            lastNode.next = new ListNode(list.get(i));   // create and append
            lastNode = lastNode.next;                    // move to next node
        }

        return head;
    }

    public static void printNodes(ListNode list) {

        ListNode current = list;

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ArrayList<Integer> getValues(ListNode list) {

        ArrayList<Integer> listInteger = new ArrayList<>();

        ListNode current = list;

        while (current != null) {
            listInteger.add(current.val);
            current = current.next;
        }

        return listInteger;
    }

    public static void main(String[] args) {

        run();
    }

}
