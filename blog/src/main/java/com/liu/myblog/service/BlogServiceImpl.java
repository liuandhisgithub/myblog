package com.liu.myblog.service;

import com.liu.myblog.dao.BlogDao;
import com.liu.myblog.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(BlogService.CODE)
public class BlogServiceImpl implements BlogService{
    @Autowired
    @Qualifier(BlogDao.CODE)
    private BlogDao blogDao;
    public void insertOneBlog(Blog blog) {
        blogDao.insertOneBlog(blog);
    }
    public void findAll(){
        blogDao.findAll();
    }
}
