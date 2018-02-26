package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.employee.model.LoginDb;

@Repository
public interface LoginDbRepository extends JpaRepository<LoginDb, String> {

}
