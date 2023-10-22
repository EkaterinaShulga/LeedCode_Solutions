package com.github.EkaterinaShulga.medium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MajorityElement_229 {
    public List<Integer> majorityElement(int[] nums) {

        Set<Integer> set = new HashSet<>();
        List<Integer> listResult = new ArrayList<>();

        for (int n : nums) {
            set.add(n);
        }
        List<Integer> listUniqueNumbers = new ArrayList<>(set);
        for (int y : listUniqueNumbers) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == y) {
                    count++;
                }
            }
            if (count > nums.length / 3) {
                listResult.add(y);
            }

        }

        return listResult;

    }

    public static void main(String[] args) {
        MajorityElement_229 major = new MajorityElement_229();
        int[] nums = {3, 2, 3};
        // int[] nums = {3,2,3, 2,2,2, 1 ,1,1,1};
        System.out.println(major.majorityElement(nums));

    }
}
