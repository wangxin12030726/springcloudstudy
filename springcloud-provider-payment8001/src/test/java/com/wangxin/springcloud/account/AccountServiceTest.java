package com.wangxin.springcloud.account;

import com.wangxin.springcloud.SpringcloudProviderPayment8001;
import com.wangxin.springcloud.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;
    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }
}
