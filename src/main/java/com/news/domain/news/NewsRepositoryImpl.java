//package com.news.domain.news;
//
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.RequiredArgsConstructor;
//
//import java.util.List;
//
//import static com.news.domain.news.QNews.news;
//
//@RequiredArgsConstructor
//public class NewsRepositoryImpl implements NewsRepositoryCustom {
//
//    private final JPAQueryFactory queryFactory;
//
//    @Override
//    public List<News> findByCompanyName(String companyName) {
//        return queryFactory
//                .selectFrom(news)
//                .where(news.title.eq(companyName))
//                .fetch();
//    }
//}
