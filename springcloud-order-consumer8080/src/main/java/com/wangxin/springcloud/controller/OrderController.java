package com.wangxin.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wangxin.springcloud.entities.Account;
import com.wangxin.springcloud.entities.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    private static final  String PRIMARY_URL = "http://SPRINGCLOUD-PROVIDER-PAYMENT";
//    private static final  String PRIMARY_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "defaultFindAll")
    @RequestMapping("/order/findAll")
    public CommonResult findAll(){
        return restTemplate.getForObject(PRIMARY_URL+"/account/findAll",CommonResult.class);
    }

    public CommonResult defaultFindAll(){
        Account account = new Account(-1,"test",200);
        List<Account> list = new ArrayList<Account>();
        list.add(account);
        return new CommonResult<List>(500,"查询失败，请稍后再试",list);
    }
}
