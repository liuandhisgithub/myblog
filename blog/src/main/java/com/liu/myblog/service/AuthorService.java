package com.liu.myblog.service;

import com.liu.myblog.entity.Author;

import java.util.List;

public interface AuthorService {
    String CODE = "com.liu.myblog.service.AuthorService";

    List<Author> findAll();

    void save(Author author);
}
