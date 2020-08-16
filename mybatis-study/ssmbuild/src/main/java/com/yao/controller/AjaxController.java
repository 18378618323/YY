package com.yao.controller;

import com.yao.pojo.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public void ajax(String name, HttpServletResponse response) throws IOException {
        System.out.println("name==>"+name);
        if(name.equals("ajax")){
            response.getWriter().println("true");
        }else{
            response.getWriter().println("false");
        }
    }
    @RequestMapping("/a2")
    public List<Books> a2(){
        List<Books> list = new ArrayList<>();
        list.add(new Books(1,"java小益",10,"太棒了"));

        return list;
    }
    @ResponseBody
    @RequestMapping("/user")
    public String user(String name,String pwd){
        System.out.println("name==>"+name+",pwd==>"+pwd);
        String msg = "";
        if(name!=null){
            if(name.equals("admin")){
                msg = "ok";
            }else{
                msg = "用户名已存在或者有误";
            }
        }
        if(pwd!=null){
            if(name.equals("123456")){
                msg = "ok";
            }else{
                msg = "密码有误";
            }
        }
        return msg;

    }
}