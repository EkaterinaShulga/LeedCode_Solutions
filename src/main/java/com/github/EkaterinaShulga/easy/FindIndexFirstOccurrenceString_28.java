package com.github.EkaterinaShulga.easy;

public class FindIndexFirstOccurrenceString_28 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        FindIndexFirstOccurrenceString_28 find = new FindIndexFirstOccurrenceString_28();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(find.strStr(haystack,needle));
    }
}
