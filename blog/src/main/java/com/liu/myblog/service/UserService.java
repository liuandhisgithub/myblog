package com.liu.myblog.service;

import com.liu.myblog.entity.User;

public interface UserService {
    public static final String CODE = "com.liu.myblog.service.UserService";

    void save(User user);
}
