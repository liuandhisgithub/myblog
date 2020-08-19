package com.liu.myblog.action;

import com.liu.myblog.entity.Blog;
import com.liu.myblog.entity.Comment;
import com.liu.myblog.service.BlogService;
import com.liu.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller(BlogAction.CODE)
@RequestMapping("/blog")
public class BlogAction {
    public static final String CODE = "com.liu.myblog.action.BlogAction";

    @Autowired
    @Qualifier(BlogService.CODE)
    BlogService blogService;

    @Autowired
    @Qualifier(CommentService.CODE)
    CommentService commentService;

    @RequestMapping("save")
    public String save(Blog blog){
        blogService.save(blog);
        return "success";
    }

    //暂时先不加分页,因为我不太会 OPZ
    @RequestMapping("find")
    public ModelAndView find(){
        ModelAndView modelAndView = new ModelAndView("blogList");
        List<Blog> blogList = blogService.findAll();
        modelAndView.addObject("blogList",blogList);
        return modelAndView;
    }

    @RequestMapping("find/one")
    public ModelAndView findOne(int id){
        ModelAndView modelAndView = new ModelAndView("blogContent");
        Blog blog = blogService.findOne(id);
        List<Comment> commentList = commentService.findList(id);
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("commentList",commentList);
        return modelAndView;
    }

    @RequestMapping("delete/one")
    public String deleteOne(@RequestParam("id") Integer id){
        blogService.deleteOne(id);
        return "success";
    }
}
