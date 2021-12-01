package com.news.web;

import com.news.config.auth.LoginUser;
import com.news.config.auth.dto.SessionUser;
import com.news.service.company.CompanyService;
import com.news.service.news.NewsService;
import com.news.service.posts.PostsService;
import com.news.web.dto.NewsListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final NewsService newsService;
    private final CompanyService companyService;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){
        model.addAttribute("news",newsService.findAllDesc());
        model.addAttribute("companyList",companyService.findAllDesc());
        if(user!=null){
            model.addAttribute("userName",user.getName());
        }
        return  "index";
    }

    @GetMapping("/search")
    public String search(String keyword,Model model){
        model.addAttribute("newsSearchList",newsService.search(keyword));
        model.addAttribute("companySearchList",companyService.search(keyword));

        return  "search";
    }

    @GetMapping("/posts")
    public String posts(Model model, @LoginUser SessionUser user){

        model.addAttribute("posts", postsService.findAllDesc());
        if(user!=null){
            model.addAttribute("userName",user.getName());
        }
        return  "posts";
    }

    //회사 페이지, 회사 뉴스 목록, 키워드 , 긍부정 값.
    @GetMapping("/company/{name}")
    public String company(@PathVariable("name") String name, Model model){
        List<NewsListResponseDto> CompanyNewsList = newsService.findByCompanyName(name);
        model.addAttribute("CompanyNewsList",CompanyNewsList);
        model.addAttribute("PositiveCount", Collections.frequency(CompanyNewsList,"1"));
        model.addAttribute("company",companyService.findByName(name));
        return  "company";
    }

}


