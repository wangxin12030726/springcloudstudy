package com.wangxin.springcloudaliaba.service.impl;

import com.wangxin.springcloud.entities.Account;
import com.wangxin.springcloudaliaba.dao.AccountDao;
import com.wangxin.springcloudaliaba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public void add(Account account) {
        accountDao.add(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
