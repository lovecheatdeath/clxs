package com.clxs.controller;

import java.util.ArrayList;
import java.util.List;

import atg.taglib.json.util.JSONObject;
import com.clxs.pojo.*;

import com.clxs.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class frontController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductsService productsService;
    @Autowired
    WorkerService workerService;
    @Autowired
    BannerService bannerService;
    @Autowired
    MessageService messageService;
    int code;


//    获取所有一二级标题接口
    @RequestMapping(value = "/works/title",method = RequestMethod.GET)
    public String getAllTitle(ModelMap map){
        List<Products> products=productsService.list(true);
        List worker=workerService.upLordWork();
        code=200;
        map.addAttribute("products",products);
        map.addAttribute("works",worker);
        map.addAttribute("code", code);
        return "homeList";
    }

    //获取某一级作品集下的上架的作品
    @RequestMapping(value="/products",method = RequestMethod.GET)
    public String getByProducts(@RequestParam("parentId") Integer parentId,@RequestParam("status") Boolean status,Model model)throws Exception{
        List<Product> product=productService.getByParentId(parentId,status);
        if(product.size()!=0){
            code=200;
        model.addAttribute("products",product);
        model.addAttribute("code",code);
        return "selectProduct";}
        else{
            code=404;
            model.addAttribute("code",code);
            return "error"; }
    }

    //获取某作品详情
    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    public String getProductById(@PathVariable("id") Integer id,Model model)throws Exception{
        Product product=productService.selectById(id);
        if(product!=null){
        code=200;
        model.addAttribute("code",code);
        model.addAttribute("product",product);
        return "product";}
        else{
            code=404;
            model.addAttribute("code",code);
            return "error";
        }

    }

    //查询工作室一二级
        @RequestMapping(value = "/work/titles",method = RequestMethod.GET)
        public String getWork(Model model){
        List work=workerService.upLordWork();
        if(work.size()!=0){
            code=200;
            model.addAttribute("code",code);
            model.addAttribute("titles",work);
            return "work";
        }else{
            code=404;
            model.addAttribute("code",code);
            return "error";
        }
    }

    //获取工作室详情
    @RequestMapping(value = "/work/{id}",method = RequestMethod.GET)
    public String getWorkById(@PathVariable("id")Integer id,Model model){
        Worker worker=new Worker();
        worker=workerService.getById(id);
        code=200;
        model.addAttribute("code",code);
        model.addAttribute("work",worker);
        return "worker";
    }


    //获取banner列表
    @RequestMapping(value = "/banner",method = RequestMethod.GET)
    public String getBanner(Model model){
        List list= bannerService.getBannerList();
        code=200;
        model.addAttribute("code",code);
        model.addAttribute("upLoadBanner",list);
        return "listbanner";
    }

    //进入某一张Banner
    @RequestMapping(value = "/banner/{id}",method = RequestMethod.GET)
    public String getBannerById(@PathVariable("id")Integer id,Model model){
        Banner banner=bannerService.getBannerById(id);
        code=200;
        model.addAttribute("code",code);
        model.addAttribute("banner",banner);
        return "banner";
    }

    //查看一个作品下的精选留言
    @RequestMapping(value = "/message/{productId}",method = RequestMethod.GET)
    public String getMessageByProduct(@PathVariable("productId")Integer productId,Model model){

        List list=messageService.getMessageByProduct(productId);
        code=200;
        model.addAttribute("code",code);
        model.addAttribute("messageByProduct",list);
        return "productMessage";
    }

    //给某作品留言
    @RequestMapping(value = "/addMessage",method = RequestMethod.POST)
    public ModelAndView addMessageToProduct(@RequestBody Message message,ModelAndView mav){
        message.setParentId(message.getParentId());
        message.setProductId(message.getProductId());
        message.setContent(message.getContent());
        message.setStatus(false);
        message.setType(message.getType());
        message.setCreateAt(System.currentTimeMillis());
        message.setCreateBy(message.getCreateBy());
        messageService.insertMessage(message);
        code=200;
        mav.addObject("code",code);
        mav.setViewName("success");
        return mav;
    }
}
