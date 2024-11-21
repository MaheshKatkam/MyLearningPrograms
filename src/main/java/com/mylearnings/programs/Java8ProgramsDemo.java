package com.mylearnings.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8ProgramsDemo {

    public static void main(String[] args) {
        String str = "maheshkatkam";
        Map<String,Long> charsMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charsMap);




       List<String> duplicatehars =  charsMap.entrySet().stream()
                .filter(charEntry ->charEntry.getValue()>1).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicatehars);
        System.out.println();






        List<String> duplicateChars = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()>1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateChars);

        List<String> uniqueChars = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()==1).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(uniqueChars);

        String nonRepatedFirstOccuranceChar = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()==1).map(Map.Entry::getKey)
                        .findFirst().get();
               // .collect(Collectors.toList()).get(0);
        System.out.println("nonRepatedFirstOccuranceChar. "+ nonRepatedFirstOccuranceChar);

        List<Integer> numbers = Arrays.asList(7,2,3,7,1,14,4,5,6);
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0));

        System.out.println("Max Number : " +numbers.stream()
                .max(Integer::compareTo)
                .get());
        System.out.println(numbers.stream()
                .collect(Collectors.minBy(Integer::compareTo))
                .get());

    }
}
