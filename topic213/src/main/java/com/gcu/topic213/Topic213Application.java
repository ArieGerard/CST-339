package com.gcu.topic213;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.gcu" })
public class Topic213Application {

    public static void main(String[] args) {
        SpringApplication.run(Topic213Application.class, args);
    }

}