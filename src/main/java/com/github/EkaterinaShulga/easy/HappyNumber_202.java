package com.github.EkaterinaShulga.easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber_202 {
    public boolean isHappy(int n) {

        int count = 0;
        boolean result = true;
        List<Integer> list;

        if (n == 1) {
            return true;
        } else {
            list = returnNewList(n);
            n = returnSum(list);
            while (n != 1) {
                list = returnNewList(n);
                n = returnSum(list);
                count++;
                if (n == 1) {
                    return true;
                }
                if (count > n) {
                    return false;
                }
            }
        }
        return result;

    }

    public List<Integer> returnNewList(int num) {

        List<Integer> list = new ArrayList<>();
        String number = String.valueOf(num);
        int lastNumber;
        for (int i = 0; i < number.length(); i++) {
            lastNumber = Character.digit(number.charAt(i), 10);
            list.add(lastNumber);
        }
        return list;
    }

    public int returnSum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum = sum + num * num;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber_202 happyHumber = new HappyNumber_202();
        // int number = 30;
        //  int number = 1111111;//true
        //int number = 4;//false
        int number = 2;//false
        //  int number = 3;//false
        //  int number = 7;//true
        //  int number = 19;
        System.out.println(happyHumber.isHappy(number));
    }
}
