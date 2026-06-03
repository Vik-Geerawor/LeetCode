package org.vik.easy;

public class FirstOccurrence {

    public static int strStr(String haystack, String needle) {

        return strStrV1(haystack, needle);
    }

    public static int strStrV1(String haystack, String needle) {

        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {

//        String haystack = "sadbutsad"; String needle = "sad";
        String haystack = "badsadbutsad"; String needle = "sad";
//        String haystack = "leetcode"; String needle = "leeto";

        int i = strStr(haystack, needle);
        System.out.println(i);

    }
}
