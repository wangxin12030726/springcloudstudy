package com.wangxin.springcloud.dao;

import com.wangxin.springcloud.entities.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountDao {
    public void add(Account account);

    public void delete(Integer id);

    public List<Account> findAll();
}
