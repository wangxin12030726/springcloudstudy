package com.wangxin.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wangxin.springcloudalibaba.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/nacos/config")
public class NacosConfigController {
    @Value("${wangxin.config.name}")
    private String name;
    @Value("${wangxin.config.address}")
    private String address;
    @Autowired
    private TestService testService;


    @RequestMapping("/test")
    public String testNacosConfig(){
        String str =  "hello " + name + ",你的地址是:" +address;
        //int i = 10/0;
        System.out.println(str);
        return str;
    }
    @RequestMapping("/hello")
    public String hello(String name){
        String hello = testService.hello(name);
        return hello;
    }






}
