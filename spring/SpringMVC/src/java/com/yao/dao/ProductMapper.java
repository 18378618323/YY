package com.yao.dao;

import com.yao.pojo.User;
import com.yao.pojo.product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    List<product> getAllProduct();
    product queryProductById(@Param("id") Integer id);
    int updateProduct(product product);
    int addProduct(product product);
    List<product> voQueryProduct(product product);

}
