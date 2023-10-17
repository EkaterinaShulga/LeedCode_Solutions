package com.github.EkaterinaShulga.easy;

public class DefangingIPAddress_1108 {
    public String defIPAddr(String address) {

        return address.replace(".", "[.]");

    }

    public static void main(String[] args) {
        DefangingIPAddress_1108 def = new DefangingIPAddress_1108();
        String address = "1.1.1.1";
        System.out.println(def.defIPAddr(address));
    }
}
