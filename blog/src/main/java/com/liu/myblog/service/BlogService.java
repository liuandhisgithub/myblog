package com.liu.myblog.service;

import com.liu.myblog.entity.Blog;

public interface BlogService {
    public static final String CODE = "com.liu.myblog.service.BlogService";
    public void insertOneBlog(Blog blog);
}
