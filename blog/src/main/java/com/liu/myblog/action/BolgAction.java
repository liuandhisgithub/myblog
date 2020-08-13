package com.liu.myblog.action;

import com.liu.myblog.entity.Blog;
import com.liu.myblog.service.BlogService;
import com.liu.myblog.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;
import java.util.Date;

@Controller
@RequestMapping("blog")
public class BolgAction {
    @Autowired
    BlogServiceImpl blogServiceImpl;
    @RequestMapping("insert")
    public void insert(){
        Blog blog = new Blog();
        blog.setId(1);
        blog.setName("text");
        blog.setAuthorId("me");
        blog.setContent("helloWorld,helloMyBlog");
        blog.setCreateTime(new Date());
        blogServiceImpl.insertOneBlog(blog);
    }
}
