package com.liu.myblog.dao;

import com.liu.myblog.entity.Blog;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao {
    void insertOneBlog(Blog blog);
}
