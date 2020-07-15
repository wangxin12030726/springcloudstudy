package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudProviderPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderPayment8001.class,args);
    }

}
