package com.github.EkaterinaShulga.easy;

public class FaultyKeyboard_2810 {
    public String finalString(String s) {
        StringBuilder stb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != 'i') {
                stb.append(ch);
            } else {
                stb.reverse();
            }
        }

        return stb.toString();

    }

    public static void main(String[] args) {
        FaultyKeyboard_2810 keyboard = new FaultyKeyboard_2810();
        // String s = "string";
        String s = "numberiletteriihome";
        System.out.println(keyboard.finalString(s));
    }
}
