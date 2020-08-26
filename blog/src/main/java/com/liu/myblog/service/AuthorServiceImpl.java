package com.liu.myblog.service;

import com.liu.myblog.dao.AuthorDao;
import com.liu.myblog.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(AuthorService.CODE)
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    @Qualifier(AuthorDao.CODE)
    private AuthorDao authorDao;

    public List<Author> findAll(){
        return authorDao.findAll();
    }

    public void save(Author author){
        authorDao.insertOneAuthor(author);
    }
}
