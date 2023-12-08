package com.github.EkaterinaShulga.easy;

public class LexicographicallySmallestPalindrome_2697 {
    public String makeSmallestPalindrome(String s) {
        char[] ar = s.toCharArray();
        for (int i = 0, j = ar.length - 1; i < ar.length / 2; i++, j--) {
            if (ar[i] != ar[j]) {
                if (ar[i] > ar[j]) {
                    ar[i] = ar[j];
                } else {
                    ar[j] = ar[i];
                }
            }
        }
        return new String(ar);

    }

    public static void main(String[] args) {
        LexicographicallySmallestPalindrome_2697 lex = new LexicographicallySmallestPalindrome_2697();
        //  String s = "egcfe";//efcfe
        String s = "abcd";//abba
        System.out.println(lex.makeSmallestPalindrome(s));

    }
}
