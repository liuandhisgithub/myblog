package com.liu.myblog.solrDao;

import com.liu.myblog.entity.SolrAuthor;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(AuthorDocumentDao.CODE)
public interface AuthorDocumentDao extends SolrCrudRepository<SolrAuthor, String> {
    String CODE = "com.liu.myblog.solrDao.AuthorDocumnetDao";
}
