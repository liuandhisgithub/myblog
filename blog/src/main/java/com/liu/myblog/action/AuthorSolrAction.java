package com.liu.myblog.action;

import com.liu.myblog.entity.SolrAuthor;
import com.liu.myblog.service.AuthorSolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller(AuthorSolrAction.CODE)
@RequestMapping("/author/solr")
public class AuthorSolrAction {
    public static final String CODE = "com.liu.myblog.action.AuthorSolrAction";

    @Autowired
    @Qualifier(AuthorSolrService.CODE)
    private AuthorSolrService authorSolrService;

    @RequestMapping("/into")
    public String into(){
        authorSolrService.saveAll();
        return "success";
    }
    @RequestMapping("/search")
    public ModelAndView search(String all){
//        ModelAndView modelAndView = new ModelAndView("redirect: /blog/views/search.jsp");
        ModelAndView modelAndView = new ModelAndView("search");
        List<SolrAuthor> solrAuthorList = authorSolrService.search(all);
        modelAndView.addObject("authorList",solrAuthorList);
        return modelAndView;
    }
}
