package com.yao.controller;

import com.yao.pojo.product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class AjaxController {

    @RequestMapping("/btnAjax.action")
//    @ResponseBody
    public product btnAjax(product product){
        

        System.out.println("name==>"+product.getName()+"price==>"+product.getPrice());
        System.out.println("product==>"+product);

        product.setName("红红火火");
        product.setPrice(3200.3f);

        return product;
    }
}
