package com.github.EkaterinaShulga.easy;

public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int result = 0;

        if(target>nums[nums.length-1]){
            return nums.length;
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            if (target == nums[i]) {
                return i;
            }
            if(nums[i]==target-1){
                return i+1;
            }
            if (nums[i] == target + 1) {
                result = i;
            }


        }

        return result;

    }

    public static void main(String[] args) {
        SearchInsertPosition_35 seach = new SearchInsertPosition_35();
        //int[] nums = {1,3,5,6};//2
        //  int target = 5;
        //int[] nums = {1,3,5,6};//1
        //  int target = 2;
        //int[] nums = {1, 3, 5, 6};
        //int target = 7;
        // int[] nums = {1, 3, 5, 6};//0
        // int target = 0;
        //int[] nums = {2,3,4,8,10};//0
        // int target = 0;
        int[] nums = {2,3,4,7,8,9};//6
        int target = 11;
        // int[] nums = {1};//1
        //int target = 2;
        // int[] nums = {1,3};//1
        //  int target = 3;//1
        // int[] nums = {1,3,5};
        // int target = 4;//2
        System.out.println(seach.searchInsert(nums, target));
    }
}

