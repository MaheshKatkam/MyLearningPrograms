package com.mylearnings.programs;

public class ConvertStringToIntegerDemo {

    public static void main(String[] args) {
        String number = "12345";
        System.out.println(covertToInteger(number));
    }

    public static int covertToInteger(String number){
        int result=0;
        int startIndex = 0 ;
        int sign = 1;
        if(number.charAt(0) == '-'){
            startIndex = 1;
            sign=-1;
        }
        for(int i = startIndex ; i < number.length() ; i++){
            if(number.charAt(i) >='0' && number.charAt(i)<='9'){
                result = result*10 + (number.charAt(i)-'0');
            }else {
                throw new IllegalArgumentException("Invalid character in number: " + number.charAt(i));
            }
        }
        return result * sign;
    }
}
