package com.github.EkaterinaShulga.easy;

import java.util.Arrays;

public class PlusOne_66 {
    public int[] plusOne(int[] digits) {

        int[] finishArray = new int[digits.length + 1];
        finishArray[0] = 1;
        int count = 0;

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }

        for (int digit : digits) {
            if (digit == 9) {
                count++;
            }
        }

        if (count == digits.length) {
            return finishArray;
        }

        if (count < digits.length) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i] = digits[i] + 1;
                    break;
                } else if (digits[i] == 9) {
                    digits[i] = 0;
                }
            }
        }
        return digits;
    }


    public static void main(String[] args) {
        PlusOne_66 one = new PlusOne_66();
        // int[] plus = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,4,9,4,7,0,1,1,7,4,0,0,6};
        // int[] plus = {3,9,9};
        //  int[] plus = {1,9,9,9};
        //  int[] plus = {1, 9, 9, 4};
        // int[] plus = {9, 9, 9};
        //int[] plus = {9};
        int[] plus = {9, 8, 9};
        System.out.println(Arrays.toString(one.plusOne(plus)));
    }

}
