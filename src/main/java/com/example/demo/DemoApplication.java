package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        SpringApplication.run(DemoApplication.class, args);
    }

}
