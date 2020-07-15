package com.wangxin.springcloud.service;

import com.wangxin.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-PAYMENT8001")
public interface OrderServiceFeignClient {
    @RequestMapping("/account/findAll")
    public CommonResult<List> findAll();
}
