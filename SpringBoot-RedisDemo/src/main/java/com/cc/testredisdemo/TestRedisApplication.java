package com.cc.testredisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class TestRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestRedisApplication.class,args);
    }
}
