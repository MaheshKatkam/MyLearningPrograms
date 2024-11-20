package com.mylearnings.programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharsInStringDemo {



    public static void main(String[] args) {
        String str = "maheshkatkam";

        System.out.printf("Duplicate Chars in string " +Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(m ->m.getValue()>1).collect(Collectors.toList()));
    }
}
