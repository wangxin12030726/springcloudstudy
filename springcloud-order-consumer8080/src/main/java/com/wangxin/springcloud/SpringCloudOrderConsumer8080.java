package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudOrderConsumer8080 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrderConsumer8080.class,args);
    }
}
