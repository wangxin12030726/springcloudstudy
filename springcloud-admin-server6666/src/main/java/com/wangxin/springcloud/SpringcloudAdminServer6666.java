package com.wangxin.springcloud;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class SpringcloudAdminServer6666 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAdminServer6666.class,args);
    }
}
