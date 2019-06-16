package com.clxs.mapper;

import com.clxs.pojo.Product;
import com.clxs.pojo.Products;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class ProductsMapperTest extends TestCase {
    @Autowired
    private ProductsMapper productsMapper;



    @Test
    public void testSelect(){
        Products products=new Products();
        products.setId(2);
        System.out.println(productsMapper.selectIdProducts(products));
        System.out.println(products);
    }
    @Test
    public void testSelects(){
        Products products=new Products();
        products.setId(2);
        System.out.println(productsMapper.selectProducts(products));
    }
}