package com.yao.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yao.HandlerExecptionResolver.MyExecption;
import com.yao.VO.ProductAndUserVO;
import com.yao.pojo.product;
import com.yao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    //遍历商品
    @RequestMapping("/listProduct")
    public String listProduct(Model model) throws MyExecption {

//        if(true){
//            throw new MyExecption("没有找到！！！！！");
//        }


//        //异常获取位置
//        int i = 1/0;

        List<product> allProduct = productService.getAllProduct();
        model.addAttribute("list",allProduct);

        return "listProduct";
    }
    //跳转到增加商品页面
    @RequestMapping("/toAddProduct")
    public String toAddProduct(){
        return "addProduct";
    }
    //
    @RequestMapping("/AddProduct")
    public String AddProductPage(product product){
        int i = productService.addProduct(product);
        if(i>0){
            System.out.println("增加成功");
        }else{
            System.out.println("增加失败");
        }
        return "redirect:/listProduct";
    }
    @RequestMapping("/toUpdateProduct/{id}")
    public String updateProduct(@PathVariable("id") Integer id, Model model){
        product product = productService.queryProductById(id);
        model.addAttribute("product",product);
        return "updateProductPage";
    }
    @RequestMapping("/updateProduct")
    public String updateProduct(product product, Model model, MultipartFile pictrueFile) throws IOException {
        String originalFilename = pictrueFile.getOriginalFilename();
        System.out.println(originalFilename);

        //上传的文件名+后缀
        String newFileName =UUID.randomUUID().toString()+ originalFilename.substring(originalFilename.lastIndexOf("."));


        pictrueFile.transferTo(new File("D:\\Program Files (x86)\\Tencent\\springBoot\\spring\\SpringMVC\\web\\iamges\\" + newFileName));


        //把照片名字存进数据库
        product.setPic(newFileName);
        int i = productService.updateProduct(product);
        if(i>0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        return "redirect:/listProduct";
    }

    //使用layUI+PageHelper分页插件
//    @ResponseBody
//    @RequestMapping("/productList")
//    public String layuiPagehelper(String page, String limit, ModelAndView modelAndView) throws JsonProcessingException {
//        System.out.println("page=>"+page+",,limit=>"+limit);
//        int pages = Integer.parseInt(page);
//        int limits = Integer.parseInt(limit);
//        System.out.println("pages=>"+pages+",,limits=>"+limits);
//
//        List<product> products = productService.layuiPagehelperGetProduct(pages, limits);
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("code",0);
//        map.put("mag","");
//        map.put("count",41);
//        map.put("data",products);
//
//        //Jackson====>json格式数据
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        return objectMapper.writeValueAsString(map);
//    }
    @ResponseBody
    @RequestMapping("/productList")
    public Map<String,Object> layuiPagehelper(String page, String limit, ModelAndView modelAndView){
        System.out.println("page=>"+page+",,limit=>"+limit);
        int pages = Integer.parseInt(page);
        int limits = Integer.parseInt(limit);
        System.out.println("pages=>"+pages+",,limits=>"+limits);

        List<product> products = productService.layuiPagehelperGetProduct(pages, limits);

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("mag","");
        map.put("count",41);
        map.put("data",products);

        //Jackson====>json格式数据
        ObjectMapper objectMapper = new ObjectMapper();

        return map;
    }

    //批量删除
    @RequestMapping("/deleteAll")
    public String deleteAll(Integer[] ids){
        System.out.println("ids==>"+ Arrays.toString(ids));
        //删除操作

        //重定向请求
        return "redirect:/listProduct";
        //转发请求
//        return "forward:/listProduct";
    }

}
