package com.clxs.service.serviceImpl;


import com.clxs.mapper.ProductMapper;
import com.clxs.mapper.ProductsMapper;
import com.clxs.pojo.Product;
import com.clxs.pojo.Products;
import com.clxs.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductsMapper productsMapper;

    Product product=new Product();
    Products products;

    //前台:查询下上架的作品
    @Override
    public List<Product> getByStatus(Product product){
        return productMapper.select(product);
    }

    //前台:查询作品集下上下架作品
    @Override
    public List<Product> getByParentId(Integer parentId,Boolean status){
        products=new Products();
        products.setStatus(status);
        products.setParentId(parentId);
        List list=productsMapper.selectProducts(products);
        List list1=new ArrayList();
        if(list.size()!=0){
        for(int i=0;i<list.size();i++){
            products=(Products) list.get(i);
            list1.add(products.getId());
        }
       }
        else{
            list1.add(parentId);
            return productMapper.selectByProducts(list1,status);
        }

        return productMapper.selectByProducts(list1,status);
    }
    //后台:查询某一作品集下所有作品
    @Override
    public List<Product> selectWithParentId(Product parentId){
        return productMapper.select(parentId);
    }
    //根据id查询某一作品详情
    @Override
    public Product selectById(Integer id){
        product.setId(id);
        return productMapper.selectSelective(product);
    }



    //递归查询所有父节点
//    @Override List<Products> allProducts();

    //获取作品列表,拼接上parentid和name
//    @Override
//    public List<Map<String,Object>> getParents(Integer id){
//        List<Map<String,Object>> list=new ArrayList<Map<String, Object>>();
//        //把所有作品放到Map里面
//        Product product=productMapper.selectSelective(id);
//        Map<String,Object> map=new HashMap<String, Object>();
//        map.put("id",product.getId());
//        Products products=productsMapper.selectIdProducts(product.getParentId());
//        if(products.getParentId() == 0){
//
//        }
//        return null;
//    }


    //已知层级下的子查父查询
    @Override
    public List<Map<String,Object>> getParents(){
        List<Product> product1=productMapper.select1();

        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        for(int j=0;j<product1.size();j++) {
            Map<String, Object> map = new HashMap<String, Object>();
            product=product1.get(j);
            product = productMapper.selectSelective(product);
            map.put("id", product.getId());
            map.put("name", product.getName());
            int Id = 0;
            Id = product.getParentId();
            int i = 0;
//            if(Id != 0){
            while (Id != 0) {
//            for(int i=0;i<2;i++){
                products=new Products();
                products.setId(Id);
//                System.out.println(products);
                Products products2=productsMapper.selectIdProducts(products);
//                System.out.println(products2);
                map.put("parent" + i, products2.getName());
                Id=products2.getParentId();
                System.out.println(Id);
                i++;
//            }
            }
            map.put("status", product.getStatus());
            map.put("createAt", product.getCreateAt());
            map.put("createBy", product.getCreateBy());
            map.put("updateAt", product.getUpdateAt());
            map.put("updateBy", product.getUpdateBy());
            list.add(map);
        }
        return list;
    }
}
