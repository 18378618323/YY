package com.yao.service;

import com.yao.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User queryUser(User user);
}
