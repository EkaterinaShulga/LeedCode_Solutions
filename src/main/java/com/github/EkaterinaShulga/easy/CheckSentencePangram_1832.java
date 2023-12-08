package com.github.EkaterinaShulga.easy;

import java.util.HashSet;
import java.util.Set;

public class CheckSentencePangram_1832 {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (char i : sentence.toCharArray()) {
            set.add(i);
        }

        return set.size() == 26;

    }

    public static void main(String[] args) {
        CheckSentencePangram_1832 pangram = new CheckSentencePangram_1832();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";//true
        System.out.println(pangram.checkIfPangram(sentence));
    }
}
