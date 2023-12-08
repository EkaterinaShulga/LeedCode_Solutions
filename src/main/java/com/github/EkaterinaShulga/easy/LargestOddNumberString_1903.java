package com.github.EkaterinaShulga.easy;

public class LargestOddNumberString_1903 {
    public String largestOddNumber(String num) {


        for (int i = num.length() - 1; i >= 0; i--) {

            char c = num.charAt(i);
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                return num.substring(0, i + 1);

            }
        }
        System.gc();
        return "";


    }

    public static void main(String[] args) {
        LargestOddNumberString_1903 lag = new LargestOddNumberString_1903();
        String num = "52";//5
        //  String num = "10133890";//1013389
        System.out.println(lag.largestOddNumber(num));

    }
}
