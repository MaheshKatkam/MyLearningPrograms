package com.mylearnings.programs;

import java.util.LinkedList;

public class ProgramsMain {

    public static void main(String[] args) {
        //  System.out.println(count(3242341));
      //  System.out.println(isHarshadNum(481));

      //  System.out.println(unrepeated("mmmaaahessshhhk"));

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(lcmOfArray(arr));

        LinkedList linkedList = new LinkedList();
        linkedList.add(null);

    }

    public static int count(int n) {
        return Math.abs(n) < 10 ? 1 : 1 + count(n / 10);
    }

    public static boolean isHarshadNum(int number) {
        int diviser = digtsOfNumber(number);
        return number % diviser == 0;
    }

    private static int digtsOfNumber(int num) {
        if (num < 10) {
            return num;
        } else {
            int reminder = num % 10;
            num = num / 10;
            return reminder + digtsOfNumber(num);
        }
    }

    public static String unrepeated(String str) {
        String x="";
        for(int i = 0;i<str.length(); i++){
            if(!x.contains(str.substring(i,i+1))){
                x+= str.substring(i,i+1);
            }
        }
        return x;
    }

    public static int lcmOfArray(int[] arr)
    {
        int prod = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            int n = gcd(prod,arr[i]);
            prod = (prod*arr[i])/n;
        }
        return prod;
    }

    public static int gcd(int a,int b)
    {
        if (b == 0) return a;
        return gcd(b,a%b);
    }
}


