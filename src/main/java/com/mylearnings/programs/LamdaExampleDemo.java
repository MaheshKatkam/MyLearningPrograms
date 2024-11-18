package com.mylearnings.programs;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class LamdaExampleDemo {
    public static void main(String[] args) {
    /*   Runnable runnable =  () -> System.out.printf("Runnable Method");

       runnable.run();
*/
       Consumer<Integer> consumer = (s) -> System.out.println(s);

        Predicate<Integer> predicate = i -> i %2 == 0;
      // consumer.accept(10);

        List<Integer> list = Arrays.asList(4,8,18,21,35);
        list.stream().sorted().forEach(consumer);

        //PredicateDemo
        System.out.println("Predicate filter logic.");
        list.stream().filter(predicate).forEach(consumer);

        list = Arrays.asList();
        System.out.println("Supplier Demo");
        Supplier<Integer> supplier = () -> 100;
        System.out.println(list.stream().findAny().orElseGet(supplier));

        // Map object with streams
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);

      //  BiConsumer<String,Integer> stringIntegerBiConsumer = (a,b) -> System.out.println(a , b);
       // map.forEach((s, integer) -> System.out.println(s + " " + integer));

       // map.forEach(stringIntegerBiConsumer);
      //  map.entrySet().


    }
}
