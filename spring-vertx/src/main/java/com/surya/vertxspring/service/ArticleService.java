package com.surya.vertxspring.service;

import com.surya.vertxspring.entity.Article;
import com.surya.vertxspring.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }

}
