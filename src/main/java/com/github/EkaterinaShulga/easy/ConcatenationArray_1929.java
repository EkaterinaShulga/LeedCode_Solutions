package com.github.EkaterinaShulga.easy;

import java.util.Arrays;

public class ConcatenationArray_1929 {
    public int[] getConcatenation(int[] nums) {

        int[] secondNums = new int[nums.length*2];
        System.arraycopy(nums, 0, secondNums, secondNums.length-nums.length,nums.length);
        System.arraycopy(nums, 0, secondNums, 0,nums.length);

        System.gc ();

        return secondNums;

    }
    public static void main(String[] args) {
        ConcatenationArray_1929 array = new ConcatenationArray_1929();
        int[] arr = {1,2,1};
        int[]secondArr = array.getConcatenation(arr);
        System.out.println(Arrays.toString(secondArr));

    }
}
