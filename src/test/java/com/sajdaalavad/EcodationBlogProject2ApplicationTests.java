package com.sajdaalavad;



import com.sajdaalavad.data.entity.EmployeeEntity;
import com.sajdaalavad.data.repository.EmployeeRepository;
import lombok.extern.log4j.Log4j2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


/*

import com.hamitmizrak.data.entity.EmployeeEntity;
import com.hamitmizrak.data.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
*/



@SpringBootTest
class EcodationBlogProject2ApplicationTests {
   /* @Autowired
    EmployeeRepository repository;

    @Override
    @Test
    public void testCreated() {
        EmployeeEntity employeeEntity=EmployeeEntity.builder().employeeName("Hamit")
                .employeeEmail("hamitmizrak@gmail.com").employeeage("34").build();
        repository.save(employeeEntity);

        //database eklenecek ilk data 1 datadır
        assertNotNull(repository.findById(1L).get());

    }

    @Override
    @Test
    public void testFind() {
        EmployeeEntity employeeEntity=repository.findById(1L).get();
        assertEquals("Hamit",employeeEntity.getEmployeeName());

    }

    @Override
    @Test
    public void testList() {
        List<EmployeeEntity> entityList=repository.findAll();
        assertThat(entityList).size().isGreaterThan(0);

    }
    @Override
    @Test
    public void testUpdate() {
        EmployeeEntity employeeEntity=repository.findById(1L).get();
        employeeEntity.setEmployeeName("Hamit44");
        repository.save(employeeEntity);
        assertNotEquals("Hamit",repository.findById(1L).get().getEmployeeName());
    }

    @Override
    @Test
    public void testDelete() {
        repository.deleteById(1L);
        assertThat(repository.existsById(1L)).isFalse();
    }

    buraya kadar
*/


  /*  @Autowired
    EmployeeRepository repository;


    @Override
    @Test
    public void testCreated() {
        EmployeeEntity employeeEntity=EmployeeEntity.builder().employeeName("Hamit")
                .employeeEmail("hamitmizrak@gmail.com").build();
        log.info(employeeEntity);
        repository.save(employeeEntity);

        //database eklenecek ilk data 1 datadır
        assertNotNull(repository.findById(1L).get());
    }

    @Override
    @Test
    public void testFind() {
        EmployeeEntity employeeEntity=repository.findById(1L).get();
        assertEquals("Hamit",employeeEntity.getEmployeeName());

    }

    @Override
    @Test
    public void testList() {
        List<EmployeeEntity> entityList=repository.findAll();
        assertThat(entityList).size().isGreaterThan(0);
    }

    @Override
    @Test
    public void testUpdate() {
        EmployeeEntity employeeEntity=repository.findById(1L).get();
        employeeEntity.setEmployeeName("Hamit44");
        repository.save(employeeEntity);
        assertNotEquals("Hamit",repository.findById(1L).get().getEmployeeName());
    }

    @Override
    @Test
    public void testDelete() {
        repository.deleteById(1L);
        assertThat(repository.existsById(1L)).isFalse();
    }*/
}
