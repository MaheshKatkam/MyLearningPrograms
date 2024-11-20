package com.mylearnings.programs;


import org.springframework.util.StringUtils;

import java.util.Arrays;

import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestSubStringWithoutRepeatedCharsDemo {

    public static void main(String[] args) {
        String str = "aabcdefa";
        String finalString = "";
        for(int i=0; i <= str.length() ; i++){
            for(int j = i+1 ; j <= str.length() ; j++){
                String s = str.substring(i,j);
                if( s.length()>1 && !checkDuplicateCharsFound(s)){
                    if(StringUtils.isEmpty(finalString) || finalString.length() < s.length()){
                        finalString=s;
                        System.out.println("Final String : "+finalString);
                    }
                };
            }
        }
        System.out.println("Final String is : "+finalString);
    }

    private static boolean  checkDuplicateCharsFound(String s){

       boolean duplicateCharPresentInString = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1).findAny().isPresent();
        System.out.println("Duplicate Chars Found String :"+ s  + " "+duplicateCharPresentInString);
       return duplicateCharPresentInString;
    }
}
