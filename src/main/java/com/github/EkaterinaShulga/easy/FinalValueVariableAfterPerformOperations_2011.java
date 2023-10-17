package com.github.EkaterinaShulga.easy;

public class FinalValueVariableAfterPerformOperations_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        int num;

        for(String s:operations){
            if (s.equals("--X")) {
                String d = s.replace("--X", "-1");
                num = Integer.parseInt(d);
                result = result + num;
            } else if (s.equals("++X")) {
                String d = s.replace("++X", "1");
                num = Integer.parseInt(d);
                result = result + num;
            } else if (s.equals("X--")) {
                String d = s.replace("X--", "-1");
                num = Integer.parseInt(d);
                result = result + num;
            } else if (s.equals("X++")) {
                String d = s.replace("X++", "1");
                num = Integer.parseInt(d);
                result = result + num;

            }
        }
        return result;

    }

    public static void main(String[] args) {
        FinalValueVariableAfterPerformOperations_2011 oper = new FinalValueVariableAfterPerformOperations_2011();
        //String[] operations = {"--X","X++","X++"};
        String[] operations = {"++X","++X","X++"};
        //   String[] operations = {"X++", "++X", "--X", "X--"};
        int result = oper.finalValueAfterOperations(operations);
        System.out.println(result);
    }
}
