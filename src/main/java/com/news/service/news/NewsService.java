package com.news.service.news;

import com.news.domain.news.NewsRepository;
import com.news.web.dto.NewsListResponseDto;
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
}
