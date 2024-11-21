package com.mylearnings.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringSortedOrderDemo {

    public static void main(String[] args) {
        String str = "mahesh";

        System.out.println("Sorted String "+Arrays.stream(str.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
}
