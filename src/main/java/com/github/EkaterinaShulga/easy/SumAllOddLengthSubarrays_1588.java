package com.github.EkaterinaShulga.easy;

public class SumAllOddLengthSubarrays_1588 {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int size = arr.length;
        int step;

        while (size != 0) {
            if (size % 2 != 0 && size > 1) {
                for (int i = 0, k = size - 1; i < arr.length - (size - 1); i++, k++) {
                    step = size;
                    int p = k;
                    while (step != 0 && p > i - 1) {
                        sum = sum + arr[p];
                        p--;
                        step--;

                    }
                }
            }
            if (size == 1) {
                for (int i = 0; i < arr.length; i++) {
                    sum = sum + arr[i];
                }
            }

            size--;
        }

        return sum;


    }


    public static void main(String[] args) {
        SumAllOddLengthSubarrays_1588 sum = new SumAllOddLengthSubarrays_1588();
        int[] arr = {1, 4, 2, 5, 3}; // 58
        System.out.println(sum.sumOddLengthSubarrays(arr));
    }
}
