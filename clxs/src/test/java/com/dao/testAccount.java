package com.dao;


import com.clxs.mapper.AccountMapper;
import com.clxs.pojo.Account;
import org.apache.http.HttpRequest;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;
import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//
//@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class testAccount {
//    @Autowired
    AccountMapper accountMapper;
    Account account=new Account();
    Long time=System.currentTimeMillis()/1000;
    @Before
    public void before(){
    ApplicationContext acx=new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
    accountMapper=(AccountMapper)acx.getBean("accountMapper");
    }
    @Test
    public void add(){

        account.setName("周星驰");
        account.setUsername("610893080");
        account.setPassword("7210332");
        account.setCreateAt(time);
        account.setCreateBy("周润发");
        account.setUpdateAt(time);
        account.setUpdateBy("111");
        accountMapper.insert(account);
        System.out.println(account.getId());
    }
    @Test
    public void select(){

        System.out.println(accountMapper.selectByPrimaryKey(1));
    }
    @Test
    public void update(){

    }
    @Test
    public void testEquals() {
        int int1 = 12;
        int int2 = 12;


        Integer integer1 = new Integer(12);
        Integer integer2 = new Integer(12);
        Integer integer3 = new Integer(127);

        Integer a1 = 127; //或者写成Integer a1 = Integer.valueOf(127);
        Integer a2 = 127;//或者写成Integer a2 = Integer.valueOf(127);

        Integer a = 128;
        Integer b = 128;

        System.out.println("int1 == int2 -> " + (int1 == int2));
        System.out.println("int1 == integer1 -> " + (int1 == integer1));
        System.out.println("integer1 == integer2 -> " + (integer1 == integer2));
        System.out.println("integer3 == a1 -> " + (integer3 == a1));
        System.out.println("a1 == a2 -> " + (a1 == a2));
        System.out.println("a == b -> " + (a == b));
    }
    @Test
    public void test(){
        System.out.println(4>>1);
    }
    @Test
    public void testsin() {
        for (int i = 0; i < 100000; i++) {
            int a1 = i * 52429 >>> 19;
            int a2 = i / 10;
            if (a1 != a2) {
                System.out.println(i);

            }
        }
    }
    @Test
    public void testGetChar(){
        String name= UUID.randomUUID().toString();
//        name.replaceAll("-","");
        System.out.println(name);
    }
}
