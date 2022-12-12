package com.example.community.article_image.domain;

import com.example.community.article.domain.Article;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagUrl;

    @ManyToOne
    private Article article;
}
