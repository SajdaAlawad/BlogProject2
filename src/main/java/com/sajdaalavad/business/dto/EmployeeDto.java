package com.sajdaalavad.business.dto;


import com.sajdaalavad.data.entity.EmployeeEntity;
import com.sajdaalavad.data.entity.companyEntity;
import lombok.*;

import java.util.Objects;

//lombok
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

@ToString
public class EmployeeDto {

    public Long employeeId;
    public String employeeName;
    public String employeeEmail;
    public int employeeage;
    public int employeesalary;
    public int employeeworkingyear;

    private PlainCompanyDto plainCompanyDto;

    public static EmployeeDto from(EmployeeEntity employeeEntity){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmployeeId(employeeDto.getEmployeeId());
        employeeDto.setEmployeeName(employeeDto.getEmployeeName());
        employeeDto.setEmployeeEmail(employeeDto.getEmployeeEmail());
        employeeDto.setEmployeeage(employeeDto.getEmployeeage());
        employeeDto.setEmployeesalary(employeeDto.getEmployeesalary());
        employeeDto.setEmployeeworkingyear(employeeDto.getEmployeeworkingyear());
        if(Objects.nonNull(employeeEntity.getCompany())){
            employeeDto.setPlainCompanyDto(PlainCompanyDto.from(employeeEntity.getCompany()));
        }
        return employeeDto;
    }
    //private companyEntity companyEntity;
}
