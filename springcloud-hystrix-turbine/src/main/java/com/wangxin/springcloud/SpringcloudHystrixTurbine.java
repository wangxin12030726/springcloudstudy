package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class SpringcloudHystrixTurbine {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixTurbine.class,args);
    }
}
