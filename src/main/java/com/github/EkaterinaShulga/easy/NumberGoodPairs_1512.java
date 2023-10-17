package com.github.EkaterinaShulga.easy;

public class NumberGoodPairs_1512 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int y = 1; y < nums.length; y++) {
                if (nums[i] == nums[y] && i < y) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberGoodPairs_1512 pairs = new NumberGoodPairs_1512();
        //int[] nums = {1, 2, 3, 1, 1, 3};
        // int[] nums = {1,1,1,1};
        int[] nums = {1, 2, 3};
        System.out.println(pairs.numIdenticalPairs(nums));
    }
}
