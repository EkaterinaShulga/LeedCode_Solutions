package com.github.EkaterinaShulga.easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter_2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>(words.length);
        String c = String.valueOf(x);
        for(int i=0; i<words.length; i++){
            if(words[i].contains(c)){
                list.add(i);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        FindWordsContainingCharacter_2942 find = new FindWordsContainingCharacter_2942();
        String[] words = {"leet","code"};
        char x = 'e' ;
        System.out.println(find.findWordsContaining(words, x));
    }
}
