package com.liu.myblog.service;

import com.liu.myblog.entity.Comment;

import java.util.List;

public interface CommentService {
    String CODE = "com.liu.myblog.service.CommentService";
    void save(Comment comment);
    public List<Comment> findList(int blogId);
}
