package com.liu.myblog.action;

import com.liu.myblog.entity.Comment;
import com.liu.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.plugin.com.event.COMEventHandler;

@Controller(CommentAction.CODE)
@RequestMapping("/comment")
public class CommentAction {
    public static final String CODE = "com.liu.myblog.action.CommentAction";

    @Autowired
    @Qualifier(CommentService.CODE)
    private CommentService commentService;
    @RequestMapping("submitComment")
    public String save(Comment comment){
        commentService.save(comment);
        return "redirect:../blog/find/one?id="+comment.getBlogId();
    }
}
