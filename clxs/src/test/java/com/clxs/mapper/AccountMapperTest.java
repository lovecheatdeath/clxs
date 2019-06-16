package com.clxs.mapper;

import com.clxs.pojo.Account;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class AccountMapperTest extends TestCase {
    @Autowired
    AccountMapper accountMapper;

    Account account=new Account();

    @Test
    public void insert(){
        Account account=new Account();
        account.setName("靓仔");
        account.setUsername("610893080");
        account.setPassword("hjh7210332");
        System.out.println(accountMapper.insertSelective(account));
    }
    @Test
    public void select(){
        account.setUsername("hjh7210332");
        account.setPassword("7210332");
        System.out.println(accountMapper.selectByUsernameAndPassword(account));
    }


}