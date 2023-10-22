package com.github.EkaterinaShulga.easy;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int a = 0;
        int[] ar = new int[set.size()];
        for (int y : set) {

            ar[a] = y;
            a++;
        }
        // int[] ar =  Arrays.stream(nums).distinct().toArray(); or this way

        for (int i = 0; i < nums.length; i++) {
            if (i < ar.length) {
                nums[i] = ar[i];
            } else {
                nums[i] = 0;
            }
        }
        return ar.length;

    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray_26 removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray_26();
        // int[] nums = {3,5,7,3,7,8,9};
        int[] nums = {1, 1, 2};
        // int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.println(k);
    }
}
