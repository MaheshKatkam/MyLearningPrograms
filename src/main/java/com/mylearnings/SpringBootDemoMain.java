package com.mylearnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoMain {


    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoMain.class, args);

    }
}