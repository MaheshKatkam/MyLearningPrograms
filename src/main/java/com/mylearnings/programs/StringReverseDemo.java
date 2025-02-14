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
        reveseString = reveseString+str.substring(str.length()-1);
        String remainingString = str.substring(0,str.length()-1);
        return  stringReverse(remainingString,reveseString);
    }
}
