package org.vik.easy;

public class LastWord {

    public static int lengthOfLastWord(String s) {

        return lengthOfLastWordV2(s);
    }

    public static int lengthOfLastWordV2(String s) {

        String[] stringArray = s.split("\s");
        return stringArray[stringArray.length - 1].length();
    }

    public static void main(String[] args) {

//        String s = "Hello World";
//        String s = "   fly me   to   the moon  ";
        String s = "luffy is still joyboy        ";

        int i = lengthOfLastWord(s);
        System.out.println(i);
    }
}
