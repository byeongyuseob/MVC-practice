package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity // DB Will generate Table by this class
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 전략
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public void patch(Article article) {
        if (article.title != null){
            this.title = article.title;
        }

        if(article.content != null){
            this.content = article.content;
        }
    }
}