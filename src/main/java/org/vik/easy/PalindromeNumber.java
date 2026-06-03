package org.vik.easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        Integer a = Integer.valueOf(x);

        if (a < 0 || a > 2147483647) {
            return false;
        }

        Integer b;
        try {
            b = Integer.valueOf(new StringBuilder(a.toString()).reverse().toString());
        } catch (NumberFormatException e) {
            return false;
        }

        System.out.println(a + " : " + b);
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234567899));
    }
}
