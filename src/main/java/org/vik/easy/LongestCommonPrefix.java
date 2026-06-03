package org.vik.easy;

import java.util.*;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        return getCommonPrefixUsingIndex(strs);
//        return getCommonPrefixUsingCollection(strs);
    }

    private static String getCommonPrefixUsingIndex(String[] strs) {

        // single element array
        if (strs.length == 1) {
            return strs[0];
        }

        // empty string
        // 1. sort array
//        Arrays.stream(strs).forEach(System.out::println);
        Arrays.sort(strs, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
//        Arrays.stream(strs).forEach(System.out::println);

        if (strs[0].equals("")) {
            return "";
        }

        int i = 0;
        String commonPrefix = "";

        outOfWhileLoop:
        while (i < strs[0].length())  {
            String currentPrefix = strs[0].substring(0, i + 1);     // end index is exclusive

            // if current prefix does not match all strings, break out of loop
            for (String s : strs) {
                if (!(s.substring(0, i + 1).equals(currentPrefix))) {
                    break outOfWhileLoop;
                }
            }

            // all strings matched
            commonPrefix = currentPrefix;

//            System.out.println(commonPrefix);

            // expand currentPrefix
            i++;
        }

        return commonPrefix;
    }

    private static String getCommonPrefixUsingCollection(String[] strs) {

        ArrayList<String> strArray = new ArrayList<>();
        for (String s : strs) {
            strArray.add(s);
        }

        // if there is only one element, return it
        if (strArray.size() == 1) {
            return strArray.getFirst();
        }

//        System.out.println(strArray);

        // sort array
        strArray.sort(Comparator.comparing(String::length));
//        System.out.println(strArray);

        // if empty string, return it
        if (strArray.getFirst().equals("")) {
            return "";
        }

        // process as usual
        int i = 0;
        String commonPrefix  = "";

        outOfWhileLoop:
        while (i < strArray.getFirst().length()) {

            // end index is substring is exclusive, so + 1
            String currentPrefix = strArray.getFirst().substring(0, i + 1);

            // check that each string contains the prefix, else break out of while loop
            for (String s : strArray) {
                if (!(s.substring(0, i + 1).equals(currentPrefix))) {
                    break outOfWhileLoop;
                }
            }

            // all strings have the current prefix so it's common
            commonPrefix = currentPrefix;

//            System.out.println(commonPrefix);

            // expand prefix
            i++;
        }

        return commonPrefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"dog","racecar","car"};
//        String[] strs = {"converse","convict","conversation"};
//        String[] strs = {"ab", "a"};
//        String[] strs = {"a", ""};
//        String[] strs = {"a"};
//        String[] strs = {"flower","flower","flower"};
//        String[] strs = {"a","b"};

        String result = longestCommonPrefix(strs);

        if (!result.equals("")) {
            System.out.println("Common prefix: " + result);
        } else {
            System.out.println("No common prefix");
        }
    }
}
