package com.news.web;

import com.news.config.auth.LoginUser;
import com.news.config.auth.dto.SessionUser;
import com.news.service.news.NewsService;
import com.news.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;
    private final NewsService newsService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("news",newsService.findAllDesc());
        return  "index";
    }

    @GetMapping("/my_posts")
    public String myPosts(Model model, @LoginUser SessionUser user){

        model.addAttribute("posts", postsService.findAllDesc());
        if(user!=null){
            model.addAttribute("userName",user.getName());
        }
        return  "my-posts";
    }


}


