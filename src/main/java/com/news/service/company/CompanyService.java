package com.news.service.company;

import com.news.domain.company.CompanyRepository;
import com.news.web.dto.CompanyListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Transactional(readOnly = true)
    public List<CompanyListResponseDto> findAllDesc(){
        return companyRepository.findAllDesc().stream()
                .map(CompanyListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<CompanyListResponseDto> search(String keyword){
        List<CompanyListResponseDto> companySearchList =companyRepository.findByNameContaining(keyword).stream()
                .map(CompanyListResponseDto::new)
                .collect(Collectors.toList());
        return companySearchList;
    }
}
