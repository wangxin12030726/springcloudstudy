package com.wangxin.springcloud.controller;

import com.wangxin.springcloud.entities.CommonResult;
import com.wangxin.springcloud.service.AccountHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private AccountHystrixService accountHystrixService;

    @RequestMapping("/orderhystrix/account/findAll")
    public CommonResult<List> findAll(){
        return accountHystrixService.findAll();
    }

}
