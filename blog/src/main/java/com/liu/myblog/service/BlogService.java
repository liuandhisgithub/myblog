package com.liu.myblog.service;

import com.liu.myblog.entity.Blog;

import java.util.List;

public interface BlogService {
    static final String CODE = "com.liu.myblog.service.BlogService";
    void save(Blog blog);
    List<Blog> findAll();
}
