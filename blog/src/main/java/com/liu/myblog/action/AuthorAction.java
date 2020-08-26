package com.liu.myblog.action;

import com.liu.myblog.entity.Author;
import com.liu.myblog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller(AuthorAction.CODE)
@RequestMapping("/author")
public class AuthorAction {
    public static final String CODE = "com.liu.myblog.action.AuthorAction";

    @Autowired
    @Qualifier(AuthorService.CODE)
    private AuthorService authorService;

    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("AuthorList");
        List<Author> authors = authorService.findAll();
        modelAndView.addObject("authorList",authors);
        return modelAndView;
    }
    @RequestMapping("save")
    public String save(Author author){
        authorService.save(author);
        return "success";
    }
}
