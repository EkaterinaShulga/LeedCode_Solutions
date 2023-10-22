package com.github.EkaterinaShulga.easy;

public class TruncateSentence_1816 {
    public String truncateSentence(String s, int k) {

        String[] ss = s.split(" ");
        StringBuilder stb = new StringBuilder();
        for(int i=0; i<k; i++){
            stb.append(ss[i]);
            stb.append(" ");

        }

        return stb.toString().trim();
    }

    public static void main(String[] args) {
        TruncateSentence_1816 trust = new TruncateSentence_1816();
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(trust.truncateSentence(s,k));
    }
}
