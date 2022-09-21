package com.sajdaalavad.business.dto;

import com.sajdaalavad.data.entity.EmployeeEntity;
import com.sajdaalavad.data.entity.companyEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CompanyDto {
    private Long id;
    private String Companyname;
    private List<EmployeeDto> employeeDto = new ArrayList<>();

    public static CompanyDto from(companyEntity companyeentity){
        CompanyDto companyDto = new CompanyDto();
        companyDto.setId(companyeentity.getComid());
        companyDto.setCompanyname(companyeentity.getCompanyName());
        companyDto.setEmployeeDto(companyeentity.getEmployeeEntities().stream().map(EmployeeDto::from)
                .collect(Collectors.toList()));
        return companyDto;
    }

}
