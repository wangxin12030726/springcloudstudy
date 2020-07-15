package com.wangxin.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wangxin.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(value="SPRINGCLOUD-PROVIDER-PAYMENT",fallback = AccountHystrixFallback.class)
public interface AccountHystrixService {

    @RequestMapping("/account/findAll")
//    @HystrixCommand
    public CommonResult<List> findAll();
}
