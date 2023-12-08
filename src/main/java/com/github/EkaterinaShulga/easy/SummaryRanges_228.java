package com.github.EkaterinaShulga.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SummaryRanges_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if(nums.length == 0){
            return list;
        }
        if(nums.length == 1){
            list.add(String.valueOf(nums[0]));
            return list;
        }
        else {
            stack.push(nums[0]);
            for (int j = 1; j < nums.length; j++) {
                if (stack.lastElement() == nums[j] - 1) {
                    stack.push(nums[j]);
                    if (j == nums.length - 1) {
                        String s = String.valueOf(stack.firstElement()) + "->" + String.valueOf(stack.lastElement());
                        list.add(s);
                    }
                } else {
                    if (stack.size() == 1) {
                        list.add(String.valueOf(stack.pop()));
                        if (j == nums.length - 1) {
                            list.add(String.valueOf(nums[j]));
                        }
                        stack.push(nums[j]);

                    }
                    if (stack.size() > 1) {
                        String s = String.valueOf(stack.firstElement()) + "->" + String.valueOf(stack.lastElement());
                        list.add(s);
                        stack.clear();
                        if (j == nums.length - 1) {
                            list.add(String.valueOf(nums[j]));
                        }
                        stack.push(nums[j]);

                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        SummaryRanges_228 sum = new SummaryRanges_228();
        int[] nums = {0, 1, 2, 4, 5, 7};
        // int[] nums = {0, 2, 3, 4, 6, 8, 9};
        //int[] nums = {-1};
        // int[] nums = {1,3};
        System.out.println(sum.summaryRanges(nums));
    }
}


