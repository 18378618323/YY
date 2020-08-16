package com.yao.VO;

import com.yao.pojo.User;
import com.yao.pojo.product;

/**
 * VO类，实现复杂类型的条件查询
 */
public class ProductAndUserVO {
    //商品
    private product product;
    //用户
    private User user;

    public com.yao.pojo.product getProduct() {
        return product;
    }

    public void setProduct(com.yao.pojo.product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ProductAndUserVO{" +
                "product=" + product +
                ", user=" + user +
                '}';
    }
}
