package com.clxs.controller;

import com.clxs.Utils.FileUpLoad;
import com.clxs.pojo.Account;
import com.clxs.pojo.Product;
import com.clxs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.clxs.Utils.FileUpLoad.fileUpload;

@Controller
@Scope(value="prototype")
public class backController {
    @Autowired
    AccountService accountService;

    FileUpLoad fileUpLoad;

    int code;

    //登录页面显示
    @RequestMapping(value = "login")
    public ModelAndView loginView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }
    //上传图片页面显示
    @RequestMapping(value = "a/upLoadImg")
    public ModelAndView upLoadImg() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("upLoadImg");
        return modelAndView;
    }

    //    @RequestMapping(value = "loginVerify",method = RequestMethod.POST)
//    @RequestBody
//    public String looginVerify(HttpServletRequest request,HttpServletResponse
//            response) throws Exception{
//        Map<String,Object> map=new HashMap<String, Object>();
//        String username=request.getParameter("username");
//        String password=request.getParameter("password");
//        String rememberme=request.getParameter("rememberme");
//        Account account=accountService.
//    }
    //登录
    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    public ModelAndView doLogin(@RequestParam String username, @RequestParam String password,
                                HttpServletRequest request,ModelAndView modelAndView) throws Exception {
        Account account = accountService.selectByUsernameAndPassword(username, password);
        code = 200;
        if (account != null) {
            HttpSession session = request.getSession();
            session.setAttribute("accountSession", account);
            modelAndView.addObject("code", code);
            modelAndView.setViewName("backindex");
            return modelAndView;
        } else {
            code = 400;
            modelAndView.addObject("code", code);
            modelAndView.setViewName("error");
            return modelAndView;
        }
    }

    //上传图片接口
    @RequestMapping(value = "/a/u/upLoadImage", method = RequestMethod.POST)
    public  String upLoad(MultipartFile file, HttpServletRequest request, HttpServletResponse response, Model model)
    throws Exception {
//    public  String upLoad(@RequestParam(value="file",required=false)MultipartFile imageFile, HttpServletRequest request, HttpServletResponse response, Model model)
//    throws Exception {
        String imagePath=null;
        imagePath =fileUpload(file,request);
        model.addAttribute("path", imagePath);
        if (!imagePath.isEmpty()&&imagePath!=null) {
            code = 200;
            model.addAttribute("code", code);
            model.addAttribute("path", imagePath);
            return "success";
        } else {
            code = 400;
            model.addAttribute("code", code);
            return "error";
        }
    }

    //新增一个作品
    @RequestMapping(value = "/a/u/addProduct")
    public String addProduct(@RequestParam("product") Product product, HttpServletRequest request, HttpServletResponse response,Model model) {
        product.setParentId(product.getParentId());
        product.setName(product.getName());
        product.setStatus(false);
        product.setCreateAt(System.currentTimeMillis());
        product.setIntroduce(product.getIntroduce());
        product.setMinipicture(product.getMinipicture());
        product.setVideoUrl(product.getVideoUrl());
        product.setPicture(product.getPicture());
        product.setArticle(product.getArticle());
        if (product!=null){
            code=200;
            model.addAttribute("code",code);
            model.addAttribute("product",product);
            return "addProduct";
        }else
            code=400;
             model.addAttribute("code",code);
             return "error";
    }

    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpSession session, ModelMap map) {
        session.removeAttribute("accountSession");
        code=200;
        map.addAttribute("code", code);
        return "index";
    }
}
