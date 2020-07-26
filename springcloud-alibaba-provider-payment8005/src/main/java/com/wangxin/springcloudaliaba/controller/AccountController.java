package com.wangxin.springcloudaliaba.controller;

import com.wangxin.springcloud.entities.Account;
import com.wangxin.springcloud.entities.CommonResult;
import com.wangxin.springcloudaliaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/account/findAll")
    public CommonResult<List> findAll(){
        List<Account> resultList = accountService.findAll();
//        int i = 10 /0 ;
        return  new CommonResult(200,"查询成功;serverPort:"+serverPort,resultList);
    }
}
