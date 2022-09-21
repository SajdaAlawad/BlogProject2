package com.sajdaalavad.data.repository;

import com.sajdaalavad.data.entity.companyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<companyEntity,Long> {
}
