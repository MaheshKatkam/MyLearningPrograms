package com.mylearnings.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCharCountDemo {

    public static void main(String[] args) {
        String str = "maheshkatkam";

       Map<String,Long> charCountMap =
               Arrays.stream(str.split(""))
                       .collect(
                               Collectors.groupingBy(Function.identity(), Collectors.counting())
                       );
        System.out.println(charCountMap);
    }
}
