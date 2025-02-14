package com.mylearnings.programs;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationsDemo {


    public static void main(String[] args) {

        generatePermutations("ABC","");

    }
    public static void generatePermutations(String str,String prefix){

        if(str.isEmpty()){
            System.out.println(prefix);
            return;
        }
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            String remainingString = str.substring(0,i) + str.substring(i+1);
            generatePermutations(remainingString,prefix+ch);
        }
    }
}
