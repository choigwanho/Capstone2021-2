package com.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing//JPA Auditing 활성화
@SpringBootApplication // 스프링부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정, 프로젝트의 메인 클래스(최상단에 위치)
public class Application { //수동 테스트(메인 메소드 실행_톰캣 서버가 8080 포트로 실행되었다는 로그 확인, localhost:8080/hello로 접속)
    public static void main(String[] args){
        SpringApplication.run(Application.class,args); //~.run으로 인해 내장 WAS 를 실행(Tomcat을 설치할 필요가 없게 되고, 스프링 부트로 만들어진Jar파일로 실행)
    }
}