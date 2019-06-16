package com.clxs.Interceptor;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse
            response,Object object) throws Exception{
        if(request.getSession().getAttribute("accountSession")==null){

            request.getRequestDispatcher("/login").forward(request,response);
            return false;
        }else{

        }
        return true;
    }
}
