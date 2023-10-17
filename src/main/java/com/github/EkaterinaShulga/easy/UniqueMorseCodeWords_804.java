package com.github.EkaterinaShulga.easy;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords_804 {
    public int uniqueMorseRepresentations(String[] words) {
        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z'};

        String[] morse =
                {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                        "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
                        "-..-", "-.--", "--.."};

        Map<Character, String> mapMorse = new LinkedHashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < english.length; i++) {
            mapMorse.put(english[i], (morse[i]));
        }
        for (String oneWord : words) {
            StringBuilder stb = new StringBuilder();
            char[] ch = oneWord.toCharArray();
            for (int i = 0; i < oneWord.length(); i++) {
                String s = mapMorse.get(ch[i]);
                stb.append(s.toCharArray());

            }

            String ss = stb.toString();
            set.add(ss);
        }


        return set.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords_804 words = new UniqueMorseCodeWords_804();
        // String[] w = {"gin", "zen", "gig", "msg"};//2
        String[] w = {"vtpke", "vngc", "vnqr", "gbzx", "qvdx"};//2
        System.out.println(words.uniqueMorseRepresentations(w));
    }

}
