package com.github.EkaterinaShulga.easy;

import java.util.HashSet;
import java.util.Set;

public class RingsRods_2103 {
    public int countPoints(String rings) {
        Set<Character> zero = new HashSet<>();
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int result = 0;
        char[] array = rings.toCharArray();
        for (int j = 0; j < numbers.length; j++) {
            for (int i = array.length - 1; i >= 0; i = i - 2) {
                if (array[i] == numbers[j]) {
                    zero.add(array[i - 1]);
                }
            }
            if (zero.size() >= 3) {
                result++;
                zero.clear();

            } else {
                zero.clear();
            }
        }

        return result;

    }

    public static void main(String[] args) {
        RingsRods_2103 ring = new RingsRods_2103();
        String s = "B0B6G0R6R0R6G9";//1
        // String s = "B0R0G0R9R0B0G0";//1
        //  String s = "G4";//0
        System.out.println(ring.countPoints(s));

    }
}
