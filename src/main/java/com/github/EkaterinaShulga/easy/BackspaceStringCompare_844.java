package com.github.EkaterinaShulga.easy;

public class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String s, String t) {

        return findElements(s).equals(findElements(t));
    }
    public String findElements(String s) {
        char[] arrayT = s.toCharArray();
        int count2 = 0;
        for (int i = arrayT.length - 1; i >= 0; i--) {
            if (arrayT[i] == '#') {
                count2++;
            }
            if (arrayT[i] != '#' && count2 > 0) {
                arrayT[i] = '0';
                count2--;
            }
        }
        StringBuilder stT = new StringBuilder();
        for (char c : arrayT) {
            if (c != '#' && c != '0') {
                stT.append(c);
            }
        }
        return stT.toString();
    }

    public static void main(String[] args) {
        BackspaceStringCompare_844 back = new BackspaceStringCompare_844();
        // String s = "ab#c";
        // String t = "ad#c"; // true
        // String s = "a##c";
        //  String t = "#a#c"; // true
        //  String s = "ab##";
        //  String t = "c#d#"; //true
        // String s = "a#c";
        //  String t = "b"; //false
        String s = "bxj##tw";
        String t = "bxj###tw"; //false
        System.out.println(back.backspaceCompare(s, t));

    }

}
