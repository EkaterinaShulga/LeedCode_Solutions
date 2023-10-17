package com.github.EkaterinaShulga.easy;

import java.util.Arrays;

public class ShuffleArray_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int k = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            if ((i % 2) == 0) {
                result[i] = nums[nums.length / 2 - k];
                k++;
            } else {
                result[i] = nums[nums.length - k];
            }
        }
        System.gc();
        return result;

    }

    public static void main(String[] args) {
        ShuffleArray_1470 array = new ShuffleArray_1470();
        // int[] nums = {1,2,3,4,4,3,2,1};
        int[] nums = {1, 1, 2, 2};
        // int[] sh = array.shuffle(nums, 4);
        int[] sh = array.shuffle(nums, 2);
        System.out.println(Arrays.toString(sh));
    }
}
