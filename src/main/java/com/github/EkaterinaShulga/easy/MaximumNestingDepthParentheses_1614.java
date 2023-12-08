package com.github.EkaterinaShulga.easy;

public class MaximumNestingDepthParentheses_1614 {
    public int maxDepth(String s) {

        int level = 0;
        int open = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
                if (level < open) {
                    level++;
                }
            }
            if (ch == ')') {
                open--;
            }
        }
        return level;

    }

    public static void main(String[] args) {
        MaximumNestingDepthParentheses_1614 maxi = new MaximumNestingDepthParentheses_1614();
        //  String s = "(1+(2*3)+((8)/4))+1"; //3
        // String s = "((8+7)*(3+9)-0)*(1*6)"; //2
        //  String s = "(1)+((2))+(((3)))"; //3
        String s = "((0-7)/7)/((2+9)/5)"; //2
        //    String s = "1"; //0
        System.out.println(maxi.maxDepth(s));
    }
}
