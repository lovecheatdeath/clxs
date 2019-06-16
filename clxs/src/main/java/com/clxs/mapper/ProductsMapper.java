package com.clxs.mapper;


import com.clxs.pojo.Products;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductsMapper {

    List<Products> list();

    List<Products> list(@Param("status") Integer status);

    boolean deleteByPrimaryKey(Products id);

    boolean insert(Products products);

    boolean insertSelective(Products products);

    Products selectIdProducts(Products id);

    List<Products> selectProducts(Products products);

    boolean updateByPrimaryKeySelective(Products products);

    boolean updateByPrimaryKey(Products products);


}