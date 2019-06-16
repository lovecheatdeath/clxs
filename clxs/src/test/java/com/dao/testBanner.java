package com.dao;

import com.clxs.mapper.BannerMapper;
import com.clxs.pojo.Banner;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class testBanner {
    @Autowired
    private BannerMapper bannerMapper;
//    Banner banner=new Banner();
@Test
    public void testGetBanner(){
    int i=0;
    List<Banner> ban =bannerMapper.getBannerList();
    for(Banner banner:ban){
        System.out.println(banner);
    }
    System.out.println(ban.size());

}
}
