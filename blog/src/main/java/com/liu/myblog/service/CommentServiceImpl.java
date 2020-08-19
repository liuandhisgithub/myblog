package com.liu.myblog.service;

import com.liu.myblog.dao.CommentDao;
import com.liu.myblog.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(CommentService.CODE)
public class CommentServiceImpl implements CommentService {
    @Autowired
    @Qualifier(CommentDao.CODE)
    private CommentDao commentDao;

    public void save(Comment comment){
        commentDao.saveOneComment(comment);
    }

    public List<Comment> findList(int blogId){
        return commentDao.findByBlogId(blogId);
    }
}
