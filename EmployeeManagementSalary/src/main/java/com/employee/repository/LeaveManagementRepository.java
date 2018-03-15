package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.LeaveManagement;

@Repository
public interface LeaveManagementRepository extends JpaRepository<LeaveManagement, Integer > {

}
