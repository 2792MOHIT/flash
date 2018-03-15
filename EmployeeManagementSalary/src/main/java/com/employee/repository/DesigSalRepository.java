package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.enums.Designation;
import com.employee.model.DesigSal;

@Repository
public interface DesigSalRepository extends JpaRepository<DesigSal, Designation> {

}