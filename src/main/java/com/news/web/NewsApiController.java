//package com.news.web;
//
//import com.news.service.news.NewsService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RequiredArgsConstructor
//@RestController
//public class NewsApiController {
//
//    private final NewsService newsService;
//
//    @GetMapping("/")
//    public String index(Model model){
//        model.addAttribute("news",newsService.newsRepository.findALlDesc());
//        return "index";
//    }
//
//}
