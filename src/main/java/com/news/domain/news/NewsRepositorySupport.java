//package com.news.domain.news;
//
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
//
//import java.util.List;
//
//import static com.news.domain.news.QNews.news;
//
//public class NewsRepositorySupport extends QuerydslRepositorySupport {
//    private final JPAQueryFactory queryFactory;
//
//    public NewsRepositorySupport(JPAQueryFactory queryFactory) {
//        super(News.class);
//        this.queryFactory = queryFactory;
//    }
//
//    public List<News> findByCompanyName(String companyName) {
//        return queryFactory
//                .selectFrom(news)
//                .where(news.title.eq(companyName))
//                .fetch();
//    }
//}
