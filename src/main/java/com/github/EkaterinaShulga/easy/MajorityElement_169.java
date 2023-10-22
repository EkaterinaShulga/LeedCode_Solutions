package com.github.EkaterinaShulga.easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {

        //first solution
       /*

       int result=0;
       Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, 0);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                value = value + 1;
                map.replace(nums[i], value);
            }
        }
        result = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).
        getKey();*/

        //second solution
        int result = 0;
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int count = 0;
        int number = 0;
        int answer = 0;
        for (int y : set) {
            for (int i = 0; i < nums.length; i++) {
                result = y;
                if (nums[i] == result) {
                    number++;
                }
            }
            if (count < number) {
                count = number;
                number = 0;
                answer = result;
            }
        }


        return answer;

    }

    public static void main(String[] args) {
        MajorityElement_169 major = new MajorityElement_169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};//2
        // int[] nums = {3, 3, 4};//3
        System.out.println(major.majorityElement(nums));

    }
}
