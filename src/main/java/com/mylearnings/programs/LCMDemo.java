package com.mylearnings.programs;

public class LCMDemo {

    public static void main(String[] args) {
        int number[] = {6,4,2,12,8,5};
        int result = number[0];
        for(int i=0 ; i < number.length ; i++) {
            result = lcm(result,number[i]);
            System.out.println(result);
        }
        System.out.println(result);
    }
    public static int lcm(int a, int b ){
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a , int b){
       while(b !=0){
           int temp = b;
           b= a%b;
           a = temp;
       }
       return a;
    }
}
