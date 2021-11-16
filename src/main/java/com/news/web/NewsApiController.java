package com.news.web;

import com.news.service.news.NewsService;
import com.news.web.dto.NewsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class NewsApiController {

    private final NewsService newsService;

    @GetMapping("/news/{id}")
    public String read(@PathVariable Long id, Model model){
        NewsResponseDto dto =newsService.findById(id);
        model.addAttribute("news",dto);
        return "news";
    }

}
