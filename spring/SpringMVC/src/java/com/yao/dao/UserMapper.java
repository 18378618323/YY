package com.yao.dao;

import com.yao.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();
    User queryUser(User user);
}
