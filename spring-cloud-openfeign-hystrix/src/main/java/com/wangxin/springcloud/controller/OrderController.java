package com.wangxin.springcloud.controller;

import com.wangxin.springcloud.entities.CommonResult;
import com.wangxin.springcloud.service.OrderServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order/consumer/feign")
public class OrderController {
    @Autowired
    private OrderServiceFeignClient orderServiceFeignClient;
    @RequestMapping("/findAll")
    public CommonResult<List> findAll(){
        CommonResult<List> all = orderServiceFeignClient.findAll();
        return all;
    }
}
