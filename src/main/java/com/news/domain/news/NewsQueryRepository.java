//package com.news.domain.news;
//
//
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//import static com.news.domain.news.QNews.news;
//
//@RequiredArgsConstructor
//@Repository
//public class NewsQueryRepository {
//
//    private final JPAQueryFactory queryFactory;
//
//    public List<News> findByCompanyName(String companyName) {
//        return queryFactory
//                .selectFrom(news)
//                .where(news.title.eq(companyName))
//                .fetch();
//    }
//}
