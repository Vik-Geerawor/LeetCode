package org.vik.easy;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class RomanToInteger {

    public static int romanToInt(String s) {

        int result = 0;

        char[] romanArray = s.toCharArray();
        int size = romanArray.length;

        int[] intArray = new int[size];

        // convert from roman to arabic
        for (int i = 0; i < size; i++) {
            intArray[i] = getValue(romanArray[i]);
        }

        // normally larger values are first
        // and we simply add the next value
        int i = 0;
        while (i < size) {

            // if i is last index
            // add to result and break
            if (i == size - 1) {
                result += intArray[i];
                break;
            }

            // if current value < next value, just add to result
            if (intArray[i] >= intArray[i+1]) {
                result += intArray[i];
            } else {
                // else add (next value - current value) to result
                result += intArray[i+1] - intArray[i];
                i++;    // jump 1 extra
            }
            i++;
        }

        return result;
    }


    private static int getValue(char first) {

        int value = 0;

        switch (first) {
            case 'I' -> value = 1;
            case 'V' -> value = 5;
            case 'X' -> value = 10;
            case 'L' -> value = 50;
            case 'C' -> value = 100;
            case 'D' -> value = 500;
            case 'M' -> value = 1000;
        }

        return value;
    }

    public static void main(String[] args) {

        String romanNumeral = "LIX";
        System.out.println(romanToInt(romanNumeral));
    }

}
