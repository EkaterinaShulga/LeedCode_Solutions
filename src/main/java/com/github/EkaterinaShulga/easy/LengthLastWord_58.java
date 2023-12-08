package com.github.EkaterinaShulga.easy;

public class LengthLastWord_58 {
    public int lengthOfLastWord(String s) {
        String sTrim = s.trim();
        int index = sTrim.lastIndexOf(" ");
        String result = sTrim.substring(index+1, sTrim.length());


        return result.length();

    }

    public static void main(String[] args) {
        LengthLastWord_58 lenght = new LengthLastWord_58();
        //  String s = "   fly me   to   the moon  "; //4
        String s = "Hello World";//5
        System.out.println(lenght.lengthOfLastWord(s));
    }

}
