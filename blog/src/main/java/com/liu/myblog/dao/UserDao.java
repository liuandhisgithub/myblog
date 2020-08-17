package com.liu.myblog.dao;

import com.liu.myblog.entity.User;
import org.springframework.stereotype.Repository;

@Repository(UserDao.CODE)
public interface UserDao {
    public static final String CODE = "com.liu.myblog.dao.UserDao";
    void insertAUser(User user);
}
