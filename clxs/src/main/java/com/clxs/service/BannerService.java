package com.clxs.service;

import com.clxs.pojo.Banner;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface BannerService {
    List<Banner> getBannerList();

    List Banner();

    //获取某一张Banner
    Banner getBannerById(Integer Id);

    boolean insertBanner(Banner banner);

    boolean deleteBanner(Integer id);

    boolean updateBanner(Banner status);

    boolean upLoadBanner(Banner banner);


}
