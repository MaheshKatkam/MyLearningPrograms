package com.mylearnings.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestNumberDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,4,8,15,65,34,2);
        Integer secondLongestNumber = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        System.out.println(secondLongestNumber);
    }
}
