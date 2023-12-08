package com.github.EkaterinaShulga.easy;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumNumberStringPairs_2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        map.put(words[0], 1);
        for (int i = 1; i < words.length; i++) {
            StringBuilder stb = new StringBuilder(words[i]);
            if (map.containsKey(stb.reverse().toString())) {
                count++;

            } else {
                map.put(words[i], 1);
            }
        }


        return count;

    }

    public static void main(String[] args) {
        FindMaximumNumberStringPairs_2744 find = new FindMaximumNumberStringPairs_2744();
        String[] words = {"cd", "ac", "dc", "ca", "zz"};//2
        // String[] words = {"aa","ab"};//0
        //  String[] words = {"ab","ba","cc"};//1

        System.out.println(find.maximumNumberOfStringPairs(words));

    }
}
