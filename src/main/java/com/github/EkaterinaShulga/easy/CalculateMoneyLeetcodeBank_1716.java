package com.github.EkaterinaShulga.easy;

public class CalculateMoneyLeetcodeBank_1716 {
    public int totalMoney(int n) {
        int result = 0;
        int rem = 0;
        int count = 0;
        if (n < 7) {
            switch (n) {
                case 1:
                    return 1;
                case 2:
                    return 3;
                case 3:
                    return 6;
                case 4:
                    return 10;
                case 5:
                    return 16;
                case 6:
                    return 21;
            }
        }
        while (n > 6) {
            n = n - 7;
            count++;
            rem = n;
        }

        int seven = count-1;
        int start = 4;
        if (count > 0) {
            result = 28;
            while (seven != 0) {
                result = result + ((start+1)*7);


                start++;
                seven--;
            }
        }
        switch (rem) {
            case 1:
                return result + 1 + count;
            case 2:
                return result + 1 + count + 2 + count;
            case 3:
                return result + 1 + count + 2 + count + 3 + count;
            case 4:
                return result + 1 + count + 2 + count + 3 + count + 4 + count;
            case 5:
                return result + 1 + count + 2 + count + 3 + count + 4 + count + 5 + count;
            case 6:
                return result + 1 + count + 2 + count + 3 + count + 4 + count + 5 + count + 6 + count;

        }


        return result;

    }

    public static void main(String[] args) {
        CalculateMoneyLeetcodeBank_1716 calc = new CalculateMoneyLeetcodeBank_1716();
        // int n = 10; //37
        //  int n = 4; // 10
        //  int n = 20;//96
        int n = 26;//135
        System.out.println(calc.totalMoney(n));
    }
}