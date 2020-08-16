package com.yao.test;

import com.yao.pojo.User;
import com.yao.service.UserService;
import com.yao.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void getAllUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl)context.getBean("userService");

        List<User> allUser = userService.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
}
