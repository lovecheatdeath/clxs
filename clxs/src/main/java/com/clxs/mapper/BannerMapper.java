package com.clxs.mapper;

import com.clxs.pojo.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BannerMapper {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Banner banner);

    boolean insertSelective(Banner banner);

    Banner selectBanner(Banner id);

    boolean updateByPrimaryKeySelective(Banner record);

    boolean updateByPrimaryKey(Banner record);

    List<Banner> getBannerList();

    List<Banner> getBannerList(@Param("status") Boolean status);

    int getCountUpLoad(int i);
}