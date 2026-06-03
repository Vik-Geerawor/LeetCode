package org.vik.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {
    public static boolean isValid(String s) {

//        return isValidv1(s);
        return isValidV3(s);
    }

    private static boolean isValidv1(String s) {
        int length = s.length();
//        System.out.println(length);

        // if empty string or odd no. of chars
        if (length == 0 || length % 2 == 1) {
            return false;
        }

        // if first and last chars are a pair
        char[] charArray = s.toCharArray();
        int i = 0;              // first index
        int j = length - 1;     // last index
        boolean isPairValid = true;

        while (i < length / 2) {
            String pair = charArray[i] + " " + charArray[j];
//            System.out.println(pair);

            List<String> validPairs = List.of("( )", "[ ]", "{ }");

            // if any mismatched pairs found
            // set flag to false and break out of loop
            if (!validPairs.contains(pair)) {
                isPairValid = false;
                break;
            }

            i++;
            j--;
        }

        return isPairValid;
    }

    private static boolean isValidv2(String s) {
        int length = s.length();

        // if empty string or odd no. of chars
        if (length == 0 || length % 2 == 1) {
//            System.out.println("Empty string or odd no. of parentheses");
            return false;
        }

        //
        char[] charArray = s.toCharArray();

        // first character is a closing parenthesis
        ArrayList<String> openingParentheses = new ArrayList<>(List.of("(", "{", "["));
        ArrayList<String> closingParentheses = new ArrayList<>(List.of(")", "}", "]"));

        // return false if first char is a closing parenthesis
        if (closingParentheses.contains(String.valueOf(charArray[0]))) {
//            System.out.println("First char is an opening parenthesis.");
            return false;
        }

        // create a deque for open parenthese
        LinkedList<String> openDeque = new LinkedList<>();

        int i = 0;      // index
        boolean isValidPair = false;

        outOfWhileLoop:
        while (i < charArray.length) {
            String current = String.valueOf(charArray[i]);

            // if open parenthses, add to deque
            if (openingParentheses.contains(current)) {
//                System.out.println("Push: " + current);
                openDeque.push(current);
            } else {
                // i.e. if closing parenthesis
                // if deque is empty, then return false
                if (openDeque.size() == 0) {
                    return false;
                }

                String lastOpening = openDeque.pop();
//                System.out.println("Pop from deque: " + lastOpening);
                switch (lastOpening + current) {
                    case "()", "[]", "{}" -> {
//                        System.out.println("Valid pair found: " + lastOpening + current);
                        isValidPair = true;
                    }
                    default -> {
//                        System.out.println("Invalid pair found: " + lastOpening + current);
                        isValidPair = false;
                        break outOfWhileLoop;
                    }
                }
            }

            i++;
        }

        if (!(openDeque.size() == 0)) {
            return false;
        }

        return isValidPair;
    }

    private static boolean isValidV3(String s) {

        int length = s.length();

        // odd length
        if (length == 0 || length % 2 == 1) {
            return false;
        }

        // starts with closed parenthese
        char[] charArray = s.toCharArray();
        switch (charArray[0]) {
            case ']', '}', ')' -> {
                return false;
            }
        }

        ArrayList<String> pairs = new ArrayList<>(List.of("[]", "{}", "()"));
        LinkedList<Character> deck = new LinkedList<>();
        boolean isValidPair = false;

        outOfForLoop:
        for (char c : charArray) {
            switch (c) {
                // if open, push to deck
                case '[', '{', '(' -> {
                    deck.push(c);
                }
                // if close, check for invalid pairs
                case ']', '}', ')' -> {
                    if (deck.size() != 0) {
                        // not a pair
                        char c1 = deck.pop().charValue();
                        String s1 = c1 + "" + c;
                        if (!pairs.contains(s1)) {
                            System.out.println(s1 + " - invalid");
                            isValidPair = false;
                            break outOfForLoop;
                        } else {
                            System.out.println(s1 + " - valid");
                            isValidPair = true;
                        }
                    } else {
                        isValidPair = false;
                    }
                }
            }
        }

        // unpaired opens
        if (deck.size() != 0) {
            isValidPair = false;
        }

        return isValidPair;
    }

    public static void main(String[] args) {
        String s = "[[[]";
        if (isValid(s)) {
            System.out.println("Valid pair/s");
        } else {
            System.out.println("Invalid pair/s");
        }
    }
}
