package com.mylearnings.programs;

public class StringPossiblePatterns {

    public static void main(String[] args) {
        String str = "abc";
        generatePossibleString("",str,str.length());
    }

    public static void  generatePossibleString(String prefix , String str , int length){
        if(prefix.length() == length){
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            generatePossibleString(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1),length);
        }
    }
}
