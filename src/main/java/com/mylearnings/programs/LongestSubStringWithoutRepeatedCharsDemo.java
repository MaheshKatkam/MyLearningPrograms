package com.mylearnings.programs;

import net.logstash.logback.encoder.org.apache.commons.lang3.StringUtils;

public class LongestSubStringWithoutRepeatedCharsDemo {

    public static void main(String[] args) {
        String str = "abcdefgaabcddcbas";
        String finalString = "";
        for(int i=0; i <= str.length() ; i++){
            for(int j = i+1 ; j <= str.length() ; j++){
                String s = str.substring(i,j);
                if(!checkDuplicateCharsFound(s)){
                    if(StringUtils.isBlank(finalString) || finalString.length() < s.length()){
                        finalString=s;
                    }
                };
            }
        }
        System.out.println("Final String is : "+finalString);
    }

    private static boolean  checkDuplicateCharsFound(String s){
        char[] chars = s.toCharArray();
        for(int i=0 ; i < chars.length ; i++){
            int charCount = 0 ;
            for(int j=0 ; j<chars.length ; j++){
                if(chars[i] == chars[j]){
                    charCount++;
                }
            }
            if(charCount>1){
                return true;
            }
        }
        System.out.println("Duplicate Chars Not  Found : "+s);

        return false;
    }
}
