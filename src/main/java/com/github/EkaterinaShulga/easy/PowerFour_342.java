package com.github.EkaterinaShulga.easy;

public class PowerFour_342 {
    public boolean isPowerOfFour(int n) {
        if (n == 4 || n == 1) {
            return true;
        }
        while (n > 1) {
            int res = n % 4;
            n = n / 4;
            if (res > 0) {
                return false;
            }
            if (n == 1) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        PowerFour_342 four = new PowerFour_342();
        // int n = 16;
        //  int n = 21;
        // int n = 4;
        //int n = 17;
        // int n = 5;
        // int n = -2147483648; //false
        //   int n = 68;//false
        //int n = 65;//false
        int n = 66;//false
        System.out.println(four.isPowerOfFour(n));
    }
}
