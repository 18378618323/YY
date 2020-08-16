package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        if(username.equals("admin")&&password.equals("123456")){
            session.setAttribute("user",username);
            return "redirect:/userList";
        }

        return "login";
    }
}
