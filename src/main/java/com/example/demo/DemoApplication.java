package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        SpringApplication.run(DemoApplication.class, args);
        List list = new ArrayList();
        for (;;) {
            list.add(new double[10]);
        }
    }

}
