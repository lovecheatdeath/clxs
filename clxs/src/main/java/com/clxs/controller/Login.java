//package com.clxs.controller;
//
//import com.clxs.pojo.Account;
//import com.clxs.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import sun.security.pkcs11.wrapper.Constants;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//@Scope(value="prototype")
//
//public class Login {
//    @Resource
//    AccountService accountService;
//
//    @Resource
//    Account account;
//
//    //登录页面显示
//    @RequestMapping(value="login")
//    public ModelAndView loginView() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("login");
//        return modelAndView;
//    }
////    @RequestMapping(value = "loginVerify",method = RequestMethod.POST)
////    @RequestBody
////    public String looginVerify(HttpServletRequest request,HttpServletResponse
////            response) throws Exception{
////        Map<String,Object> map=new HashMap<String, Object>();
////        String username=request.getParameter("username");
////        String password=request.getParameter("password");
////        String rememberme=request.getParameter("rememberme");
////        Account account=accountService.
////    }
//@RequestMapping(value = "/a/u/doLogin",method = RequestMethod.POST)
//    public ModelAndView doLogin(@RequestParam String username, @RequestParam String password,
//                          HttpServletRequest request, HttpSession session,ModelAndView modelAndView)throws Exception {
//        Account account=accountService.selectByUsernameAndPassword(username, password);
//        if(account != null){
//            session=request.getSession(true);
//            session.setAttribute("accountSession",account);
//            modelAndView.addObject("code",HttpStatus.OK);
//            modelAndView.setViewName("index");
//            return modelAndView;
//        }else {
//            modelAndView.addObject("code",HttpStatus.NOT_FOUND);
//            modelAndView.setViewName("error");
//            return modelAndView;
//        }
//    }
//@RequestMapping(value="loginOut")
//    public ModelMap loginOut(HttpSession session, ModelMap map){
//        session.removeAttribute("accountSession");
//        map.addAttribute("code",HttpStatus.OK);
//        return map;
//}
//}
