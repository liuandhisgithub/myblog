package com.liu.myblog.service;

import com.liu.myblog.dao.UserDao;
import com.liu.myblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service(UserService.CODE)
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier(UserDao.CODE)
    UserDao userDao;

    @Transactional
    public void save(User user) {
        Date createTime = new Date();
        user.setCreateTime(createTime);
        userDao.insertAUser(user);
    }
}
