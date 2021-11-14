package com.news.web.dto;

import com.news.domain.news.News;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class NewsListResponseDto {
    private Long id;
    private String title;
    private String url;
    private String pnLabel;
    private String press;
    private LocalDateTime date;
    private String category;

    public NewsListResponseDto(News entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.url=entity.getUrl();
        this.pnLabel=entity.getPnLabel();
        this.press=entity.getPress();
        this.date=entity.getDate();
        this.category=entity.getCategory();
    }
}

