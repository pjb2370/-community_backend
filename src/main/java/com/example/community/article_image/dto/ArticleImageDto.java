package com.example.community.article_image.dto;

import com.example.community.article_image.domain.ArticleImage;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleImageDto {
    private Long id;

    private String imagUrl;

    public ArticleImageDto(ArticleImage articleImage) {
        this.id = articleImage.getId();
        this.imagUrl = articleImage.getImagUrl();
    }
}
