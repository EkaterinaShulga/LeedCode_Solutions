package com.github.EkaterinaShulga.easy;

import java.util.Arrays;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != tt[i]) {
                return false;
            }


        }

        return true;


    }

    public static void main(String[] args) {
        ValidAnagram_242 anagram = new ValidAnagram_242();
        // String s = "masa";
        // String t = "asam";
        //    String s = "крыса";
        //  String t = "автомобиль";
        //   String s = "a";
        // String t = "ab";
        // String s = "ab";
        // String t = "a";
        //  String s = "a";
        //   String t = "a";
        // String s = "aa";
        //  String t = "a";
        // String s = "aacc";
        //  String t = "ccac";
        String t = "ac";
        String s = "bb";
        boolean result = anagram.isAnagram(s, t);
        System.out.println(result);
    }
}
