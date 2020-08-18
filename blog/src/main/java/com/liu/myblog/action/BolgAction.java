package com.liu.myblog.action;

import com.liu.myblog.entity.Blog;
import com.liu.myblog.service.BlogService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller(BolgAction.CODE)
@RequestMapping("/blog")
public class BolgAction {
    public static final String CODE = "com.liu.myblog.action.BolgAction";

    @Autowired
    @Qualifier(BlogService.CODE)
    BlogService blogService;

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
}
