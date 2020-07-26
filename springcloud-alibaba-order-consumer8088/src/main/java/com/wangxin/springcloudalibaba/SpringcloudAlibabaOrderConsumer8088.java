package com.wangxin.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudAlibabaOrderConsumer8088 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaOrderConsumer8088.class,args);
    }
}
