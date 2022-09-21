package com.sajdaalavad.business.dto;

import com.sajdaalavad.data.entity.companyEntity;
import lombok.Data;

@Data
public class PlainCompanyDto {
    private Long id;
    private String name;

    public static PlainCompanyDto from(companyEntity companyEntity){
        PlainCompanyDto plainCompanyDto= new PlainCompanyDto();
        plainCompanyDto.setId(companyEntity.getComid());
        plainCompanyDto.setName(companyEntity.getCompanyName());
        return plainCompanyDto;
    }
}
