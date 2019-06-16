package com.clxs.service.serviceImpl;

import com.clxs.pojo.Products;
import com.clxs.service.ProductService;
import com.clxs.service.ProductsService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class ProductServiceImplTest extends TestCase {
    @Autowired
    ProductService productService;

    Products products;
    @Test
    public void testGetByParentId() {
        Boolean status=true;
        Integer parentId=1;

        System.out.println(productService.getByParentId(parentId,status));
    }
}