package com.github.EkaterinaShulga.easy;

import java.util.Arrays;

public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] second = new int[nums.length];
        for (int i = 0, y = nums.length - 1, k = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (temp % 2 == 0) {
                second[k] = temp;
                k++;
            } else {
                second[y] = temp;
                y--;
            }
        }

        return second;

    }

    public static void main(String[] args) {
        SortArrayByParity_905 sort = new SortArrayByParity_905();
        int[] nums = {3, 1, 2, 4}; //2413
        //int[] nums = {0,1,2};//021
        // int[] nums = {3, 2, 6, 7, 8, 5};//2, 6, 8, 5, 7, 3
        // int[]nums = {0,2,1,4};
        // int[]nums = {0,1,2,4};

        System.out.println(Arrays.toString(sort.sortArrayByParity(nums)));
    }
}
