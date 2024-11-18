package com.mylearnings.programs;

public class StringReverseDemo {

    public static void main(String[] args) {
        String str = "maheshvardhan";
        System.out.println(stringReverse(str,""));

    }
    private static String stringReverse(String str,String reveseString){
        if(str.length() == 0){
            return reveseString;
        }
        reveseString = reveseString+str.charAt(str.length()-1);
        return  stringReverse(str.substring(0,str.length()-1),reveseString);
    }
}
