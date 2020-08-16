package com.yao.service;

import com.yao.pojo.product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    List<product> getAllProduct();
    product queryProductById(Integer id);
    int updateProduct(product product);
    int addProduct(product product);
    List<product> layuiPagehelperGetProduct(Integer page,Integer limit);
    List<product> voQueryProduct(product product);
}
