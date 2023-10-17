package com.github.EkaterinaShulga.easy;

public class JewelsAndStones_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] myJewels =  jewels.toCharArray();
        char[] myStones = stones.toCharArray();
        for(int i = 0; i<myJewels.length; i++){
            for(int y=0; y<myStones.length; y++){
                if(myStones[y] == myJewels[i]){
                    count++;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        JewelsAndStones_771 result = new JewelsAndStones_771();
        //  String jewels = "Aa";
        String jewels = "z";
        // String stones = "aAAbbbb";
        String stones = "ZZ";
        result.numJewelsInStones(jewels, stones);
        System.out.println(result.numJewelsInStones(jewels, stones));

    }
}
