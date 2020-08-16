package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login2";
    }
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session, Model model){
        session.setAttribute("userInfo",username);
        model.addAttribute("username",username);
        return "main";
    }
    //注销
    @RequestMapping("/toOut")
    public String toOut(HttpSession session){
        session.removeAttribute("userInfo");
        //使该会话无效，然后取消绑定*的任何对象。如果在已经无效的会话上调用此方法
        session.invalidate();
        return "login2";
    }

}
