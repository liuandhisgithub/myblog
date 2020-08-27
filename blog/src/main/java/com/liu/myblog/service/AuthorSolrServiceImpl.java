package com.liu.myblog.service;

import com.liu.myblog.dao.AuthorDao;
import com.liu.myblog.entity.Author;
import com.liu.myblog.entity.SolrAuthor;
import com.liu.myblog.solrDao.AuthorDocumentDao;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.*;
import org.springframework.data.solr.core.query.result.FacetPage;
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
            solrAuthor.setEmail(author.getEmail());
            solrAuthor.setPhone(author.getPhone());
            authorDocumentDao.save(solrAuthor);
        }
    }

    public List<SolrAuthor> search(String all){
        FacetQuery query = new SimpleFacetQuery();
        Query query1 = new SimpleQuery("defType=edismax&q=小明&qf=phone^3 name email^2&stopwords=true");
        Criteria criteria = new Criteria("all").in(all);
//        QueryFunction qf = new SimpleFunction();

        query.addCriteria(criteria);
        query1.setOffset(Long.valueOf("0"));
        query1.setRows(10);
        Page<SolrAuthor> resource1 = solrTemplate.queryForPage(SolrAuthor.CODE,query1,SolrAuthor.class);
        FacetPage<SolrAuthor> solrResource = solrTemplate.queryForFacetPage(SolrAuthor.CODE,query,SolrAuthor.class);
        List<SolrAuthor> resource = solrResource.getContent();
        List<SolrAuthor> xx = resource1.getContent();
        return xx;
    }


}
