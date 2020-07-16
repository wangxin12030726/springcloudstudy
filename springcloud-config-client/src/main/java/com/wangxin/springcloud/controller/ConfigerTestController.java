package com.wangxin.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigerTestController {
    @Value("${wangxin.test.name}")
    private String name;
    @Value("${wangxin.test.address}")
    private String address;

    @RequestMapping("/test")
    public String  test(){
        return "name: " + name + "address: " + address;
    }
}
