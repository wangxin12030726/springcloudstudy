package com.wangxin.springcloud;

import javafx.scene.shape.ArcTo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringcloudOpenfeignHystrix {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOpenfeignHystrix.class, args);
    }
}
