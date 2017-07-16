package io.rr.algorithms;

/**
 * @author roman on 7/16/17.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));

    }

    private static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        return res;
    }
}
