package org.vik.easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        return plusOneV2(digits);
    }

    public static int[] plusOneV2(int[] digits) {

        int length = digits.length;

        outOfForLoop:
        for (int i = length - 1; i > -1; i--) {
            switch (digits[i]) {
                case 8:
                    digits[i] = 9;
                    break outOfForLoop;
                case 7:
                    digits[i] = 8;
                    break outOfForLoop;
                case 6:
                    digits[i] = 7;
                    break outOfForLoop;
                case 5:
                    digits[i] = 6;
                    break outOfForLoop;
                case 4:
                    digits[i] = 5;
                    break outOfForLoop;
                case 3:
                    digits[i] = 4;
                    break outOfForLoop;
                case 2:
                    digits[i] = 3;
                    break outOfForLoop;
                case 1:
                    digits[i] = 2;
                    break outOfForLoop;
                case 0:
                    digits[i] = 1;
                    break outOfForLoop;
                case 9:
                    digits[i] = 0;

                    // if we just incremented the first element
                    if (i == 0) {
                        int[] newArray = new int[digits.length + 1];    // make a larger array
                        newArray[0] = 1;                                // new larger denomination

                        for (int j = 1; j < newArray.length; j++){
                            newArray[j] = digits[j - 1];                // fill in the rest
                        }

                        digits = newArray;                              // re-assign
                    }
            };
        }

        return digits;
    }

    public static void main(String[] args) {

//        int[] digits = {1,2,3};
//        int[] digits  = {4,3,2,1};
//        int[] digits = {1,9,9};
        int[] digits = {9,9,9};

        int[] result =  plusOne(digits);

        Arrays.stream(result).forEach(System.out::print);
    }
}
