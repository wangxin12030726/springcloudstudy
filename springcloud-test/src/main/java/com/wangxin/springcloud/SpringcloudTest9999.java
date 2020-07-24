package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudTest9999 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTest9999.class,args);
    }
}
