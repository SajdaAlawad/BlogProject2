package com.sajdaalavad.data.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sajdaalavad.business.dto.CompanyDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "company")
public class companyEntity{
   // @Id
    @Id
    @GeneratedValue
    private Long comid;

    @Column(name = "company_name")
    private String companyName;


    @Column(name = "employee_entities")
    @JsonIgnore
    @OneToMany(targetEntity = EmployeeEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName = "comid")
    private List<EmployeeEntity> employeeEntities= new ArrayList<>();

    public  void addemployeeEntity(EmployeeEntity employeeEntity){
         employeeEntities.add(employeeEntity);
     }

    public  void removemployeeEntity(EmployeeEntity employeeEntity){
        employeeEntities.remove(employeeEntity);
    }

    public static companyEntity from(CompanyDto companyDto){
        companyEntity company= new companyEntity();
        company.setCompanyName(companyDto.getCompanyname());
        return company;
    }

}

