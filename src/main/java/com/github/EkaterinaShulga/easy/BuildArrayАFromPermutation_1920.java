package com.github.EkaterinaShulga.easy;

import java.util.Arrays;

public class BuildArrayАFromPermutation_1920 {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        BuildArrayАFromPermutation_1920 build = new BuildArrayАFromPermutation_1920();
        int[] nums = {0, 2, 1, 5, 3, 4};
        // int[] nums = {5,0,1,2,3,4};
        int[] arg = build.buildArray(nums);
        System.out.println(Arrays.toString(arg));

    }
}
