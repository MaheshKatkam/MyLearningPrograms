package com.mylearnings.programs;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationsDemo {


    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        generatePermutations("ABC","", strings);
        System.out.println(strings.toString());
    }
    public static void generatePermutations(String str,String prefix,Set<String> set){

        if(str.isEmpty()){
            set.add(prefix);
        }
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            String remainingString  = str.substring(0,i) + str.substring(i+1);
            generatePermutations(remainingString,prefix+ch,set);
        }
    }
}
