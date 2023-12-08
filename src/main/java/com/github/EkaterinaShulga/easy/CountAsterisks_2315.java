package com.github.EkaterinaShulga.easy;

public class CountAsterisks_2315 {
    public int countAsterisks(String s) {
        int count = 0;
        int sl = 0;
        for (char c : s.toCharArray()) {
            if (c == '*' && sl % 2 == 0) {
                count++;
            }
            if (c == '|') {
                sl++;
            }
            if (c == '*' && sl == s.lastIndexOf("|")) {
                count++;

            }
        }


        return count;

    }

    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|"; //2
        // String s = "*||||**||*||**|**||*|||**"; //8
        //String s = "|**|*|*|**||***||"; //6
        // String s = "yo|uar|e**|b|e***au|tifu|l";//5
        CountAsterisks_2315 count = new CountAsterisks_2315();
        System.out.println(count.countAsterisks(s));
    }
}
