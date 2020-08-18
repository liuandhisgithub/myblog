package com.liu.myblog.service;

import com.liu.myblog.dao.BlogDao;
import com.liu.myblog.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service(BlogService.CODE)
public class BlogServiceImpl implements BlogService{
    @Autowired
    @Qualifier(BlogDao.CODE)
    private BlogDao blogDao;
    @Transactional
    public void save(Blog blog) {
        Date date = new Date();
        blog.setCreateTime(date);
        blogDao.insertOneBlog(blog);
    }
    public List<Blog> findAll(){
        return blogDao.findAll();
    }
}
