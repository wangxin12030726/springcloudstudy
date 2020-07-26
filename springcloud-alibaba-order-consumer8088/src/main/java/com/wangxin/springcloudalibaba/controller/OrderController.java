package com.wangxin.springcloudalibaba.controller;

import com.wangxin.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private final static String SERVICE_NAME_PRI ="http://springcloud-alibaba-provider";
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumer/order/findAll")
    public CommonResult findAll(){
        return restTemplate.getForObject(SERVICE_NAME_PRI+"/account/findAll",CommonResult.class);
    }
}
