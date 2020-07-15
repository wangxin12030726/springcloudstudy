package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringCloudApplication
@EnableFeignClients //
@EnableCircuitBreaker
public class SpringCloudOrderFeighHystrix8080 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrderFeighHystrix8080.class,args);
    }
}
