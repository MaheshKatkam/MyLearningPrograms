package com.mylearnings.programs;

public class NumberReverseDemo {

    public static void main(String[] args) {
        System.out.println(reverseNumber(123567,0));
    }

    private static int reverseNumber(int num,int reverse) {
        if(num == 0){
            return reverse ;
        }
        int remainingNum = num/10;
        reverse = (10*reverse) + num%10;
        return reverseNumber(remainingNum,reverse);
    }
}
