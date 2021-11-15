package com.news.domain.news;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

    @Query("SELECT n FROM News n ORDER BY n.id DESC")
    List<News> findALlDesc();

    List<News> findByTitleContaining(String keyword);
}
