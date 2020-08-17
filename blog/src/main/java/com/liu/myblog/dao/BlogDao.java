package com.liu.myblog.dao;

import com.liu.myblog.entity.Blog;
import org.springframework.stereotype.Repository;

@Repository(BlogDao.CODE)
public interface BlogDao {
    public static final String CODE = "com.liu.myblog.dao.BlogDao";

    void insertOneBlog(Blog blog);

    Blog findAll();
}
