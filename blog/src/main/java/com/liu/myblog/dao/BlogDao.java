package com.liu.myblog.dao;

import com.liu.myblog.entity.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(BlogDao.CODE)
public interface BlogDao {
    String CODE = "com.liu.myblog.dao.BlogDao";

    void insertOneBlog(Blog blog);

    List<Blog> findAll();

    Blog findById(int id);

    void deleteById(int id);
}
