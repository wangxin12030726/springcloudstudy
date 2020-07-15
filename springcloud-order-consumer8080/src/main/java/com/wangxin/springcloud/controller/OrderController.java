package com.wangxin.springcloud.controller;

import com.wangxin.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private static final  String PRIMARY_URL = "http://SPRINGCLOUD-PROVIDER-PAYMENT";
//    private static final  String PRIMARY_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/order/findAll")
    public CommonResult findAll(){
        return restTemplate.getForObject(PRIMARY_URL+"/account/findAll",CommonResult.class);
    }
}
