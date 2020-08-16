package com.yao.service;

import com.github.pagehelper.PageHelper;
import com.yao.dao.ProductMapper;
import com.yao.pojo.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<product> getAllProduct() {
        return productMapper.getAllProduct();
    }

    @Override
    public product queryProductById(Integer id) {
        return productMapper.queryProductById(id);
    }

    @Override
    public int updateProduct(product product) {
        return productMapper.updateProduct(product);
    }

    @Override
    public int addProduct(product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public List<product> layuiPagehelperGetProduct(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<product> allProduct = productMapper.getAllProduct();

        return allProduct;
    }

    @Override
    public List<product> voQueryProduct(product product) {
        List<com.yao.pojo.product> products = productMapper.voQueryProduct(product);
        return products;
    }
}
