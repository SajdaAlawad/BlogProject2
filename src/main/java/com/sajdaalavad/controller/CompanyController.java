package com.sajdaalavad.controller;


import com.sajdaalavad.business.dto.CompanyDto;
import com.sajdaalavad.business.services.CompanyServices;
import com.sajdaalavad.data.entity.companyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyServices companyServices;

    @Autowired
    public CompanyController(CompanyServices companyServices){
        this.companyServices= companyServices;
    }


   @PostMapping
    public ResponseEntity<CompanyDto> addCompany(@RequestBody final CompanyDto companyDto){
      companyEntity company=CompanyServices.addCompany(companyEntity.from(companyDto));
      return  new ResponseEntity<>(CompanyDto.from(company), HttpStatus.OK);
   }

   @GetMapping
    public ResponseEntity<List<CompanyDto>> getCompanies(){
        List<companyEntity> companyEntities= companyServices.getCompany();
        List<CompanyDto> companyDto= companyEntities.stream().map(CompanyDto::from).collect(Collectors.toList());
        return new ResponseEntity<>(companyDto,HttpStatus.OK);
   }
   @GetMapping(value = "{id}")
    public ResponseEntity<CompanyDto> getCompany(@PathVariable final Long id){
        companyEntity company= companyServices.getCompany(id);
        return new ResponseEntity<>(CompanyDto.from(company),HttpStatus.OK);
   }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<CompanyDto> deleteCompany(@PathVariable final Long id){
        companyEntity company= companyServices.deleteCompany(id);
        return new ResponseEntity<>(CompanyDto.from(company),HttpStatus.OK);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<CompanyDto> editCompany(@PathVariable final Long id
            ,@RequestBody final CompanyDto companyDto){
        companyEntity company= companyServices.editCompany(id,companyEntity.from(companyDto));
        return new ResponseEntity<>(CompanyDto.from(company),HttpStatus.OK);
    }
    @PostMapping(value = "{companyid}/employees/{employeeid}/add")
    public ResponseEntity<CompanyDto> addEmployeeToCompany(@PathVariable final Long comid,
                                                           @PathVariable final Long empid){
        companyEntity company= companyServices.addEmployeetoCompany(comid,empid);
        return new ResponseEntity<>(CompanyDto.from(company),HttpStatus.OK);
    }

    @DeleteMapping(value = "{companyid}/employees/{employeeid}/remove")
    public ResponseEntity<CompanyDto> removeEmployeeToCompany(@PathVariable final Long comid,
                                                           @PathVariable final Long empid){
        companyEntity company= companyServices.removeEmployeeFromCompany(comid,empid);
        return new ResponseEntity<>(CompanyDto.from(company),HttpStatus.OK);
    }
}
