package com.mylearnings.programs;

public class ReverseIntegerDemo {

    public static void main(String[] args) {
        int number = 123456;
        System.out.println(reverseNumber(number,0));

    }

   public static int reverseNumber(int number , int reverse){
        if(number == 0){
            return reverse;
        }
        reverse = (reverse*10) + number%10;
        return reverseNumber(number/10,reverse);
   }
}
