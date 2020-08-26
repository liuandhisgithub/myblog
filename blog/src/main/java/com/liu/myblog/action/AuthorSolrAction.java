package com.liu.myblog.action;

import com.liu.myblog.service.AuthorSolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
