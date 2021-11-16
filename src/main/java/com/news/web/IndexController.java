package com.news.web;

import com.news.config.auth.LoginUser;
import com.news.config.auth.dto.SessionUser;
import com.news.service.company.CompanyService;
import com.news.service.news.NewsService;
import com.news.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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


}


