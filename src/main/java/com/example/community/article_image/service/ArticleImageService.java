package com.example.community.article_image.service;

import com.example.community.article.domain.Article;
import com.example.community.article_image.dao.ArticleImageRepository;
import com.example.community.article_image.domain.ArticleImage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleImageService {
    private final ArticleImageRepository articleImageRepository;

    public void addArticleImage(String imagUrl, Article article) {
        ArticleImage articleImage = ArticleImage.builder()
                .imagUrl(imagUrl)
                .article(article)
                .build();
        articleImageRepository.save(articleImage);
    }
}
