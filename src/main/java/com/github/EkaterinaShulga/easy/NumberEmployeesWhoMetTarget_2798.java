package com.github.EkaterinaShulga.easy;

public class NumberEmployeesWhoMetTarget_2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i= 0; i<hours.length; i++){
            if(hours[i]>=target){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        NumberEmployeesWhoMetTarget_2798 num = new NumberEmployeesWhoMetTarget_2798();
        // int[] ar = {0,1,2,3,4};
        int[] ar = {5,1,4,2,2};
        // int t = 2;
        int t = 6;
        System.out.println(num.numberOfEmployeesWhoMetTarget(ar, t));
    }
}
