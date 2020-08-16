package com.yao.handlerInterCepter;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterCeptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //放行，判断什么情况下登陆

        //登陆页面也放行
        if(request.getRequestURI().contains("toLogin")){
            return true;
        }
        if(request.getRequestURI().contains("login")){
            return true;
        }
        if(session.getAttribute("userInfo")!=null){
            return true;
        }
        //判断什么情况下不可以登陆，拦截下来

        request.getRequestDispatcher("/WEB-INF/jsp/login2.jsp").forward(request,response);
        return false;
    }
}
