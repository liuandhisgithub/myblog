package com.liu.myblog.dao;

import com.liu.myblog.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(AuthorDao.CODE)
public interface AuthorDao {
    String CODE = "com.liu.myblog.dao.AuthorDao";

    List<Author> findAll();
    void insertOneAuthor(Author author);

}
