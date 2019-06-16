package com.clxs.mapper;

import com.clxs.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    List<Product> selectProduct();

    List<Product> selectProduct(Integer parentId);

    List selectByProducts(@Param("list") List parentId,@Param("status") Boolean status);

    List<Product> getProduct(Integer id);

    List<Product> select(Product product);

    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Product record);

    boolean insertSelective(Product record);

    Product selectSelective(Product product);

    Product selectProduct(Product product);

    boolean updateByPrimaryKeySelective(Product record);

    boolean updateByPrimaryKey(Product record);

    List<Product> select1();


}