package com.liu.myblog.dao;

import com.liu.myblog.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(CommentDao.CODE)
public interface CommentDao {
    String CODE = "com.liu.myblog.dao.commentDao";
    List<Comment> findByBlogId(int blogId);
    void saveOneComment(Comment comment);
}
