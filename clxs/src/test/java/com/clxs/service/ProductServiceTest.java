package com.clxs.service;

import com.clxs.mapper.ProductMapper;
import com.clxs.pojo.Product;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class ProductServiceTest extends TestCase {
    @Autowired
    ProductService productService;
    @Autowired
    ProductMapper productMapper;

    Product product = new Product();
    @Test
    public void selectProductList(){
//        product.setId(1);
        System.out.println(productService.getParents());
    }

    @Test
    public void TestConSql() {

        String a = new String();
        String b = null;
        String c = "";
        if (a == null) {
            System.out.println("a1");
        }
        if (a.isEmpty()) {
            System.out.println("a2");
        }
        if (b == null) {
System.out.println("b1");
        }
//if(b.isEmpty()) {
//System.out.println("b2");
//}
        if (c == null) {
            System.out.println("c1");
        }
        if (c.isEmpty()) {
            System.out.println("c2");
        }
    }

    @Test
    public void selectByParentId(){
        Boolean status=true;
        List list=new ArrayList();
        list.add(2);
        list.add(4);
        productMapper.selectByProducts(list,status);

    }
    @Test
    public void selsctBy(){
        Integer parentId=1;
        Boolean status=true;
        System.out.println(productService.getByParentId(parentId,status));
        System.out.println(productService.selectById(parentId));
    }
    @Test
    public void testGetByParentId() {
        Boolean status=true;
        Integer parentId=1;
        System.out.println(productService.getByParentId(parentId,status));
    }

}