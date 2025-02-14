package com.mylearnings.demo;

public class TestClass {

    public static void main(String[] args) {
        String s1="ABC";
        String s2="EDF";

        s2 = s1+s2; //ABCEDF
        s1 = s2.substring(s1.length());

        System.out.println(s1);
        System.out.println(s2.substring(0,s1.length()));

    }


}
