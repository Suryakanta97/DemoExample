package com.surya.web.controller.optionalpathvars;

import static com.surya.model.Article.DEFAULT_ARTICLE;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.model.Article;

@RestController
@RequestMapping(value = "/seperateMethods")
public class ArticleViewerWithTwoSeparateMethodsController {

    @RequestMapping(value = "/article/{id}")
    public Article getArticle(@PathVariable(name = "id") Integer articleId) {
        
        return new Article(articleId);        
    }
    
    @RequestMapping(value = "/article")
    public Article getDefaultArticle() {

        return DEFAULT_ARTICLE;
    }

}