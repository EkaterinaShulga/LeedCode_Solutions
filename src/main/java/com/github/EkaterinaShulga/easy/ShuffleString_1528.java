package com.github.EkaterinaShulga.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShuffleString_1528 {
    public String restoreString(String s, int[] indices) {

        Map<Integer, Character> map = new LinkedHashMap<>();
        char[] cc = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], cc[i]);
        }
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i < indices.length; i++) {
            stb.append(map.get(i));
        }

        return stb.toString();


    }

    public static void main(String[] args) {
        ShuffleString_1528 shuffle = new ShuffleString_1528();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(shuffle.restoreString(s, indices));
    }
}
