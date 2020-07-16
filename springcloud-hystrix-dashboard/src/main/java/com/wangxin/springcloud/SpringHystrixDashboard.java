package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableHystrixDashboard
@SpringBootApplication
public class SpringHystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(SpringHystrixDashboard.class,args);
    }
}
