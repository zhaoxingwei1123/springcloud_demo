package com.zxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookApplicetion {
    public static void main(String[] args) {
        SpringApplication.run(BookApplicetion.class,args);
    }
}
