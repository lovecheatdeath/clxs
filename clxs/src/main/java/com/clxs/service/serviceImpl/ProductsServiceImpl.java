package com.clxs.service.serviceImpl;

import com.clxs.mapper.ProductsMapper;
import com.clxs.pojo.Product;
import com.clxs.pojo.Products;
import com.clxs.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsMapper productsMapper;

    Products products=new Products();

    //获取所有上架一二级作品列表
    @Override
    public List<Products> list(){
        return productsMapper.list();
    }

    //获取所有上架作品集
    @Override
    public List<Products> list(Boolean status){
        if(status==true){
            return productsMapper.list(1);
        }else{
            return productsMapper.list(0);
        }

    }
    //获取某一作品集下所有作品
    @Override
   public List<Products> selectProducts(Products products){
        return productsMapper.selectProducts(products);
    }

    //动态插入一个作品集
    @Override
    public boolean insertSelective(Products products){
        return productsMapper.insertSelective(products);
    }

    //删除一个作品集
    @Override
    public boolean deleteByPrimaryKey(Products id){
        return productsMapper.deleteByPrimaryKey(id);
    }

    //更新一个作品集
    @Override
    public boolean updateByPrimaryKeySelective(Products products){
        return productsMapper.updateByPrimaryKeySelective(products);
    }

    //上下架作品集
//    @Override
//    public boolean upLoadProducts(Products products){
//        products=productsMapper.selectIdProducts(products);
//        if(products.)
//
//        if(products.getStatus()==true){
//
//        }
//        return productsMapper.updateByPrimaryKeySelective(products);
//    }

}