package com.liu.myblog.action;

import com.liu.myblog.entity.Blog;
import com.liu.myblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller(BolgAction.CODE)
@RequestMapping("blog")
public class BolgAction {
    public static final String CODE = "com.liu.myblog.action.BolgAction";

    @Autowired
    @Qualifier(BlogService.CODE)
    BlogService blogService;

    @RequestMapping("insert")
    public String insert(){
        Blog blog = new Blog();
        blog.setId(2);
        blog.setName("text");
        blog.setAuthorId(123);
        blog.setContent("helloWorld,helloMyBlog");
        blog.setCreateTime(new Date());
        blogService.insertOneBlog(blog);
        return "hello";
    }
}
