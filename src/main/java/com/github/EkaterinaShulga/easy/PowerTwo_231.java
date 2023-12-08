package com.github.EkaterinaShulga.easy;

public class PowerTwo_231 {
    public boolean isPowerOfTwo(int n) {
        while(n%2==0 && n>0){
            n = n/2;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        PowerTwo_231 pow = new PowerTwo_231();
        int n = 1;
        System.out.println(pow.isPowerOfTwo(n));

    }
}
