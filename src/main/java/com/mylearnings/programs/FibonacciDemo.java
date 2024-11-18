package com.mylearnings.programs;

public class FibonacciDemo {

    public static void main(String[] args) {
        for(int i = 0 ; i <=10 ; i ++)
            System.out.println(fibonacci(i));
    }

    public static int  fibonacci(int number){
        if(number <=1){
            return number;
        }
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
