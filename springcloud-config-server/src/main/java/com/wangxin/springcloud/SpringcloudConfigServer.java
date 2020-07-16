package com.wangxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServer.class,args);
    }
}
