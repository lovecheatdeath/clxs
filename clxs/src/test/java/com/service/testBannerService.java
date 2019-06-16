package com.service;


import com.clxs.mapper.BannerMapper;
import com.clxs.pojo.Banner;
import com.clxs.service.BannerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class testBannerService {
//    @Before
//            public void before(){
//        ApplicationContext ctx= new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
//
//    }
    @Autowired
    BannerService bannerService;
    Banner banner=new Banner();
//    @Test
//    public void getBannerList(){
//
//    }
    @Test
     public void insertBanner(){
        banner.setUrl("111");
        banner.setImg("222");
        banner.setStatus(true);
        banner.setCreateAt(21341234L);
        banner.setCreateBy("23421342");
        banner.setUpdateAt(3253464563L);
        banner.setUpdateBy("23413241424");
        bannerService.insertBanner(banner);
        System.out.println(banner.getId());
    }
    @Test
    public void testSelect(){
        Integer id=1;
        System.out.println(bannerService.getBannerById(id));
    }

}
