package com.clxs.service;

import com.clxs.pojo.Products;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class ProductsServiceTest {
    @Autowired
    ProductsService productsService;

    Products products=new Products();
    @Test
    public void testSelect(){
        products.setParentId(1);
        products.setStatus(true);
        System.out.println(productsService.selectProducts(products));
    }
    @Test
    public void testStatus(){
        List products=productsService.list(true);
        System.out.println(products);
    }

}