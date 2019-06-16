package com.clxs.mapper;

import com.clxs.pojo.Banner;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class BannerMapperTest extends TestCase {
    @Autowired
    BannerMapper bannerMapper;

    @Test
    public void test(){
        Banner banner=new Banner();
        banner.setId(2);
        System.out.println(bannerMapper.selectBanner(banner));
    }


}