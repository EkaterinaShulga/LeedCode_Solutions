package com.github.EkaterinaShulga.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;


    }

    public static void main(String[] args) {
        ContainsDuplicate_217 dup = new ContainsDuplicate_217();
        // int[] nums = {1,2,3,4};//false
        //  int[] nums = {0};//false
        int[] nums = {1, 2, 3, 1};//true
        //int[] nums = {1,1,1,3,3,4,3,2,4,2}; //true
        System.out.println(dup.containsDuplicate(nums));
    }
}
