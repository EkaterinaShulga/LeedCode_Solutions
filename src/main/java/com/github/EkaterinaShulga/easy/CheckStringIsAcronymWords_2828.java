package com.github.EkaterinaShulga.easy;

import java.util.ArrayList;
import java.util.List;

public class CheckStringIsAcronymWords_2828 {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder stb = new StringBuilder(); //first solution
        for (String ss : words) {
            stb.append(ss.charAt(0));
        }
        return stb.toString().equals(s);

        /*boolean result = true;                  //second solution
        String[] array = s.split("");
        if(words.size() != s.length()){
            return false;
        }
        for(int i=0; i< words.size(); i++){
            if(!words.get(i).startsWith(array[i])){
                return false;
            }
        }

        return result; */
    }

    public static void main(String[] args) {
        CheckStringIsAcronymWords_2828 check = new CheckStringIsAcronymWords_2828();
        // List<String> words = new ArrayList<>(List.of("alice","bob","charlie"));
        // List<String> words = new ArrayList<>(List.of("an","apple"));
        //List<String> words = new ArrayList<>(List.of("never","gonna","give","up","on","you"));
        List<String> words = new ArrayList<>(List.of("afqcpzsx", "icenu"));
        // String s = "abc";
        //  String s = "a";
        //   String s = "ngguoy";
        String s = "yi";
        System.out.println(check.isAcronym(words, s));
    }
}
