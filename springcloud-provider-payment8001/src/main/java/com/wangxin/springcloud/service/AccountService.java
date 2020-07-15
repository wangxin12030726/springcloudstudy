package com.wangxin.springcloud.service;

import com.wangxin.springcloud.entities.Account;

import java.util.List;

public interface AccountService {

    public void add(Account account);

    public void delete(Integer id);

    public List<Account> findAll();
}
