package com.clxs.service.serviceImpl;

import com.clxs.mapper.BannerMapper;
import com.clxs.pojo.Banner;
import com.clxs.service.BannerService;
import org.apache.ibatis.mapping.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;
    //查询所有上架的Banner图
    @Override
    public List<Banner> getBannerList(){
        Boolean status=true;
        return bannerMapper.getBannerList(status);
    }
    @Override
    public List Banner(){
        return bannerMapper.getBannerList();
    }
    //获取某一张Banner
    public Banner getBannerById(Integer Id){
        Banner banner=new Banner();
        banner.setId(Id);
        return bannerMapper.selectBanner(banner);
    }
    @Override
    //新增Banner
    public boolean insertBanner(Banner banner){
        return bannerMapper.insertSelective(banner);
    }
    //删除Banner
    @Override
    public boolean deleteBanner(Integer id){
        return bannerMapper.deleteByPrimaryKey(id);
    }
    //编辑Banner图
    @Override
    public boolean updateBanner(Banner status){
        return bannerMapper.updateByPrimaryKeySelective(status);
    }
    //查询单个Banner图详情
//    public boolean getBannerByName

    //Banner上下架实现
    @Override
    public boolean upLoadBanner(Banner banner){
            return bannerMapper.updateByPrimaryKeySelective(banner);
    }

//    @Override
//    public int insertBanner(Banner banner){
//
//    }
}
