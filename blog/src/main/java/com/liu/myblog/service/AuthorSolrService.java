package com.liu.myblog.service;

import com.liu.myblog.entity.SolrAuthor;

import java.util.List;

public interface AuthorSolrService {
    String CODE = "com.liu.myblog.servcie.AuthorSolrService";

    void saveAll();
    List<SolrAuthor> search(String all);
}
