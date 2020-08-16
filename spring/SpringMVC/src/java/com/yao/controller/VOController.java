package com.yao.controller;

import com.yao.VO.ProductAndUserVO;
import com.yao.pojo.User;
import com.yao.pojo.product;
import com.yao.service.ProductService;
import com.yao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VOController {
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    //VO==复杂类型查询
    @RequestMapping("/voQuery")
    public String voQuery(ProductAndUserVO productAndUserVO, Model model){
        System.out.println("productAndUserVO==>"+productAndUserVO);

        List<product> products = productService.voQueryProduct(productAndUserVO.getProduct());

        productAndUserVO.setUser(userService.queryUser(productAndUserVO.getUser()));
        model.addAttribute("productAndUserVO",productAndUserVO);
        return "";
    }
}
