package com.github.EkaterinaShulga.easy;

public class SmallestndexWithEqualValue_2057 {
    public int smallestEqual(int[] nums) {
        int index = Integer.MAX_VALUE;
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i % 10 == nums[i]) {
                if (i < index) {
                    index = i;
                    count++;
                }
            }
        }
        if (count == 0) {
            return -1;
        }
        return index;
    }

    public static void main(String[] args) {
        SmallestndexWithEqualValue_2057 small = new SmallestndexWithEqualValue_2057();
        int[] nums = {4, 3, 2, 1}; //2
        System.out.println(small.smallestEqual(nums));
    }
}

