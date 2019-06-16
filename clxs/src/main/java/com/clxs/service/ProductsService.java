package com.clxs.service;

import com.clxs.pojo.Products;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public interface ProductsService {

    //获取所有上架一二级作品列表
    List<Products> list();

    //获取所有上架作品集
    List<Products> list(Boolean status);

    List<Products> selectProducts(Products products);

    boolean insertSelective(Products products);

    boolean deleteByPrimaryKey(Products id);

    boolean updateByPrimaryKeySelective(Products products);

//    boolean upLoadProducts(Products products);



//    List<Products> findProducts(Map<String,Object> map) throws SQLException;
}
