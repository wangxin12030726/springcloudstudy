package com.wangxin.springcloud.service;

import com.wangxin.springcloud.entities.Account;
import com.wangxin.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountHystrixFallback implements AccountHystrixService {
    public CommonResult<List> findAll() {
        Account account = new Account(-1,"test",200);
        List<Account> list = new ArrayList<Account>();
        list.add(account);
        return new CommonResult<List>(500,"查询失败，请稍后再试",list);
    }
}
