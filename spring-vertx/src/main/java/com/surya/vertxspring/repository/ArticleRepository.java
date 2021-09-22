package com.surya.vertxspring.repository;

import com.surya.vertxspring.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
