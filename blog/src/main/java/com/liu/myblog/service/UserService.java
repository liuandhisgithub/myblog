package com.liu.myblog.service;

import com.liu.myblog.entity.User;

public interface UserService {
    String CODE = "com.liu.myblog.service.UserService";

    void save(User user);
}
