package com.mylearnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoMain1 {


    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoMain1.class, args);
        System.out.println("SpringBootDemoMain1");
    }
}