package com.wangxin.springcloudaliaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudAlibabaProvider8005 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaProvider8005.class,args);
    }
}
