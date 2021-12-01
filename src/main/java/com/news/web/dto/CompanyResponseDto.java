package com.news.web.dto;

import com.news.domain.company.Company;
import lombok.Getter;

@Getter
public class CompanyResponseDto {

    private Long id;
    private String name;
    private String info;

    public CompanyResponseDto(Company entity){
        this.id= entity.getId();
        this.name=entity.getName();
        this.info= entity.getInfo();
    }
}
