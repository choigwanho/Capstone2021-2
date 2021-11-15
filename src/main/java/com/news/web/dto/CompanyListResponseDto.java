package com.news.web.dto;

import com.news.domain.company.Company;

public class CompanyListResponseDto {
    private Long id;
    private String name;
    private String info;

    public CompanyListResponseDto(Company entity){
        this.id= entity.getId();
        this.name=entity.getName();
        this.info= entity.getInfo();
    }
}
