package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.EmployeeInfo;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfo, Long> {

}
