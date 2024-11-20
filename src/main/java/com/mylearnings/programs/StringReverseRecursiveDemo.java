package com.mylearnings.programs;

public class StringReverseRecursiveDemo {

    public static void main(String[] args) {
        String str = "vardhankatkam";
        System.out.printf("reverse string : "+reverseString(str,str.length()));

    }

    public static String reverseString(String str, int length){
        if(str.length() == 0){
            return str;
        }
        return str.substring(length-1) + reverseString(str.substring(0,length-1) , length-1);
    }
}
