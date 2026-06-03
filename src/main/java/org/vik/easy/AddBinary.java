package org.vik.easy;

public class AddBinary {

    public static String run(String a, String b) {
//        return add(a, b);
        return solutionTwo(a, b);
    }

    private static String add(String a, String b) {

        // find the sizes of longer string
        int maxLength;
        if (a.length() >= b.length()) {
            maxLength = a.length();
        } else {
            maxLength = b.length();
        }


        // store the strings in a integer array
        int[] arrayA = stringToIntegerArray(a, maxLength);
        int[] arrayB = stringToIntegerArray(b, maxLength);

        // create an array for the result
        StringBuilder result = new StringBuilder();

        // add the integers at the same index
        // case 1, add 1 in result
        // case 2, add 0 in result and set moveToNext = 1
        // case 3, add 1 in result and  set moveToNext = 1
        int moveToNext = 0;
        int columnValue = 0;

        for (int i = 0; i < maxLength; i++) {
            columnValue = arrayA[i] + arrayB[i] + moveToNext;
            switch (columnValue) {
                case 0:
                    result.append(0);
                    moveToNext = 0;
                    break;
                case 1:
                    result.append(1);
                    moveToNext = 0;
                    break;
                case 2:
                    result.append(0);
                    moveToNext = 1;
                    break;
                default:
                    result.append(1);
                    moveToNext = 1;
            }
        }

        if (moveToNext == 1) {
            result.append(1);
        }

        StringBuilder reversed = result.reverse();

        return reversed.toString();
    }

    private static int[]  stringToIntegerArray(String binaryString, int size) {

        int[] integerArray = new int[size];
        char[] charArray = binaryString.toCharArray();

        // add to new array in reverse order
        int j = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            integerArray[j] = Integer.parseInt(String.valueOf(charArray[i]));
            j++;
        }

        // fill the rest with 0
        while (j < size) {
            integerArray[j] = 0;
            j++;
        }

        return integerArray;
    }

    private static String solutionTwo(String a, String b) {

        StringBuilder stringBuilderA = new StringBuilder(a).reverse();
        StringBuilder stringBuilderB = new StringBuilder(b).reverse();
        StringBuilder result = new StringBuilder();

        int maxLength = 0;
        if (stringBuilderA.length() >= stringBuilderB.length()) {
            maxLength = stringBuilderA.length();
        } else {
            maxLength = stringBuilderB.length();
        }

        // TODO: main logic to add the bits
        int i = 0;
        String carryOver = "";
        while (i < maxLength) {
            if (stringBuilderA.charAt(i) == stringBuilderB.charAt(i)) {

            }
        }

        return "";
    }
}
