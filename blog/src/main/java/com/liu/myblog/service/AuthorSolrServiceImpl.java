package com.liu.myblog.service;

import com.liu.myblog.dao.AuthorDao;
import com.liu.myblog.entity.Author;
import com.liu.myblog.entity.SolrAuthor;
import com.liu.myblog.solrDao.AuthorDocumentDao;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(AuthorSolrService.CODE)
public class AuthorSolrServiceImpl implements AuthorSolrService {

    @Autowired
    @Qualifier(AuthorDao.CODE)
    private AuthorDao authorDao;

    @Autowired
    @Qualifier(AuthorDocumentDao.CODE)
    private AuthorDocumentDao authorDocumentDao;

    @Autowired
    private SolrTemplate solrTemplate;

    public void saveAll(){
        List<Author> authorList = authorDao.findAll();
        for(Author author : authorList){
            SolrAuthor solrAuthor = new SolrAuthor();
            solrAuthor.setId(author.getId());
            solrAuthor.setName(author.getName());
            solrAuthor.seteMail(author.geteMail());
            solrAuthor.setPhone(author.getPhone());
            authorDocumentDao.save(solrAuthor);
        }
    }


}
