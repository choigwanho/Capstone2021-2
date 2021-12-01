package com.news.service.news;

import com.news.domain.news.News;
import com.news.domain.news.NewsRepository;
import com.news.web.dto.NewsListResponseDto;
import com.news.web.dto.NewsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class NewsService {

    public final NewsRepository newsRepository;


    @Transactional(readOnly = true)
    public List<NewsListResponseDto> findAllDesc(){
        return newsRepository.findALlDesc().stream()
                .map(NewsListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<NewsListResponseDto> search(String keyword){
        List<NewsListResponseDto> newsSearchList =newsRepository.findByTitleContaining(keyword).stream()
                .map(NewsListResponseDto::new)
                .collect(Collectors.toList());
        return newsSearchList;
    }


    @Transactional(readOnly = true)
    public NewsResponseDto findById (Long id){
        News entity =newsRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 기사가 없습니다. id="+id));

        return new NewsResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<NewsListResponseDto> findByCompanyName (String companyName){
        List<NewsListResponseDto> CompanyNewsList =newsRepository.findByTitleContaining(companyName).stream()
                .map(NewsListResponseDto::new)
                .collect(Collectors.toList());

        return CompanyNewsList;
    }

//    @Transactional(readOnly = true)
//    public Integer findByCompanyNameAndPnLabel (String companyName,String pnLabel){
//        Integer Pcount =newsRepository.findByTitleAndPnLabel(companyName, pnLabel);
//        return Pcount;
//    }
}
