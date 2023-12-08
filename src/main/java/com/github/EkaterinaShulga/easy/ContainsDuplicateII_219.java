package com.github.EkaterinaShulga.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (i - index <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

       /* int fistIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            fistIndex = i;
            for (int y = 1 + i; y < nums.length; y++) {
                secondIndex = y;
                if (nums[i] == nums[y] && secondIndex - fistIndex <= k) {
                    return true;
                }
            }
        }
        return false;*/   // Time Limit Exceeded
        return false;
    }


    public static void main(String[] args) {
        ContainsDuplicateII_219 cont = new ContainsDuplicateII_219();
        //  int[] nums = {1, 2, 3, 1, 2, 3};//false
        //int k = 2;
        //   int[] nums = {1,0,1,1};//true
        //    int k = 1;
        // int[] nums = {1,2,3,1};//true
        //   int k = 3;
        //  int[] nums = {0,1,2,3,4,0,0,7,8,9,10,11,12,0};//true
        //     int k = 1;
        //  int[] nums = {99,99};//true
        //   int k = 2;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};//true
        int k = 3;
        //  int[] nums = {1,2,1};//false
        // int k = 0;
        // int[] nums = {0,1,2,3,2,5};//true
        //  int k = 3;

        System.out.println(cont.containsNearbyDuplicate(nums, k));
    }
}


