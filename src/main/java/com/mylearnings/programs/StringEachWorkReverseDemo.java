package com.mylearnings.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringEachWorkReverseDemo {
    public static void main(String[] args) {
        String str = "Mahesh Vardhan Mahalakshmi Katkam";
       str  =  Arrays.stream(str.split(" "))
               .map(s -> new StringBuilder(s).reverse().toString())
               .collect(Collectors.joining(" "));
       System.out.println(str);
    }
}
