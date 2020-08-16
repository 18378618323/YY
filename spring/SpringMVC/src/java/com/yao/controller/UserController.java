package com.yao.controller;

import com.yao.pojo.User;
import com.yao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public String userList(Model model){

        List<User> allUser = userService.getAllUser();
        model.addAttribute("list",allUser);
        return "userList";
    }
}
