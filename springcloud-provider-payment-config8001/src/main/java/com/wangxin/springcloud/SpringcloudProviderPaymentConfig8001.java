package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudProviderPaymentConfig8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderPaymentConfig8001.class,args);
    }
}
