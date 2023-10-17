package com.github.EkaterinaShulga.easy;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {

        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }

        return xor;

    }


    public static void main(String[] args) {
        SingleNumber_136 number = new SingleNumber_136();
        // int[] numbers = {5, 1, 3, 1, 3, 2, 2, 5, 35};
        //int[] numbers = {2, 2, 1};
        //  int[] numbers = {4,1,2,1,2};
        //int[] numbers = {1};
        int[] numbers = {-336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, 354};
        int result = number.singleNumber(numbers);
        System.out.println(result);

    }
}
