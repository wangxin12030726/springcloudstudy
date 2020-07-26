package com.wangxin.springcloudalibaba.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wangxin.springcloudalibaba.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @SentinelResource(value="nacoshello",blockHandler = "helloBlockHandler")
    public String hello(String name) {
        return "hello ,"+ name;
    }

    public String helloBlockHandler(String name, BlockException blockException){
        return "发生sentinel限流";
    }

}
