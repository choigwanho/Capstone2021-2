package com.news.domain.news;

import com.news.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class News extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    //기사 제목
    @Column(length=500,nullable=false)
    private String title;

    //기사 본문
    @Column(nullable = false)
    private String body;

    //기사 url
    @Column(nullable = false)
    private String url;

    //기사 본문요약
    @Column(nullable = false)
    private String shortBody;

    //기사 제공 언론사
    @Column(nullable = false)
    private String press;

    //기사 카테고리
    @Column(nullable = false)
    private String category;

    //긍부정 라벨
    @Column(nullable = false)
    private String pnLabel;

    //키워드
    @Column(nullable = false)
    private String newsKeyword;

    //기사 제공 날짜
    @Column(nullable=false)
    private LocalDateTime date;

    @Builder
    public News(String title,String url, String pnLabel,String press,LocalDateTime date,String category,String newsKeyword){
        this.id=id;
        this.title=title;
        this.url=url;
        this.pnLabel=pnLabel;
        this.press=press;
        this.date=date;
        this.category=category;
        this.newsKeyword=newsKeyword;
    }
}
