package com.mylearnings.programs;

import java.util.Scanner;

public class NewNumberDemo {

    public static int func(String s, int n, int i) {
        if (n < 0)
            return 0;
        return (s.charAt(n) - 'a' + 1) * (int) Math.pow(20, i) + func(s, n - 1, i + 1);
    }
    public static void main(String[] args) {
        String str = "at";
        System.out.println(func(str, str.length() - 1, 0));
    }
}
