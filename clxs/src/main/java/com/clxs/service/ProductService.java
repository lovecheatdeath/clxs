package com.clxs.service;

import com.clxs.pojo.Product;
import com.clxs.pojo.Products;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ProductService {

    //前台:查询下上架的作品
    List<Product> getByStatus(Product product);

    //前台:查询作品集下上下架作品
    List<Product> getByParentId(Integer parentId,Boolean status);

    //后台查询作品集下作品
    List<Product> selectWithParentId(Product parentId);

    //后台查询作品的父节点
    List<Map<String,Object>> getParents();

    //根据Id查询某一作品详情
    Product selectById(Integer id);

}
