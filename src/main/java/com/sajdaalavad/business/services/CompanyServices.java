package com.sajdaalavad.business.services;

import com.sajdaalavad.business.services.impl.EmployeeServiceImpl;
import com.sajdaalavad.data.entity.EmployeeEntity;
import com.sajdaalavad.data.entity.companyEntity;
import com.sajdaalavad.data.repository.CompanyRepository;
import com.sajdaalavad.exception.EmployeeAllreadyAssignedException;
import com.sajdaalavad.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CompanyServices {
    private final CompanyRepository companyRepository;
    private final EmployeeServiceImpl employeeService;

    @Autowired
    public CompanyServices(CompanyRepository companyRepository, EmployeeServiceImpl employeeService) {
        this.companyRepository = companyRepository;
        this.employeeService = employeeService;
    }



    public static companyEntity addCompany(companyEntity companyEntity){

        return CompanyRepository.save(companyEntity);
    }

    public List<companyEntity> getCompany(){
        return StreamSupport
                .stream(companyRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }

    public companyEntity getCompany(Long id){
        return companyRepository.findAllById(id).orElseThrow(() ->
                new ResourceNotFoundException(id));
    }

    public companyEntity deleteCompany(Long id){
        companyEntity companyEntity=getCompany(id);
        companyRepository.delete(companyEntity);
        return companyEntity;
    }


    @Transactional
    public companyEntity editCompany(Long id, companyEntity companyEntity){
        companyEntity companyToEdit =getCompany(id);
        companyToEdit.setCompanyName(companyEntity.getCompanyName());
        return companyToEdit;
    }

    @Transactional
    public companyEntity addEmployeetoCompany(Long comid,Long empid){
        companyEntity company=getCompany(comid);
        EmployeeEntity employee=employeeService.getEmployee(empid);
        if(Objects.nonNull(employee.getCompany())){
            throw new EmployeeAllreadyAssignedException(empid,employee
                    .getCompany().getComid());
        }
        company.addemployeeEntity(employee);
        employee.setCompany(company);
        return company;
    }

    @Transactional
    public companyEntity removeEmployeeFromCompany(Long comid,Long empid){
        companyEntity company= getCompany(comid);
        EmployeeEntity employee= employeeService.getEmployee(empid);
        company.removemployeeEntity(employee);
        return company;
    }


}
