package com.clxs.mapper;

import com.clxs.pojo.Product;
import com.clxs.service.ProductService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class ProductMapperTest extends TestCase {
    @Autowired
    private ProductMapper productMapper;

    Product product=new Product();
    @Test
    public void selectSelecttive(){
//        product.setName("塞尚的三姨");
        product.setId(1);
        System.out.println(productMapper.selectSelective(product));
    }
    @Test
    public void testSelectProduct(){
        System.out.println(productMapper.selectProduct());
    }
    @Test
    public void testSelect(){
        product.setId(1);
        System.out.println(productMapper.selectProduct(product));
    }
    @Test
    public void testLike(){
//        product.setName("数据结构");
        product.setId(1);
        System.out.println(productMapper.select(product));
    }

}