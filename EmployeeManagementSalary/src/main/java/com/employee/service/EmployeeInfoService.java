package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.model.EmployeeInfo;
import com.employee.repository.EmployeeInfoRepository;

/**
 * 
 * service for employeeInfo
 * 
 * @author mohit arya
 * @version 1.0
 *
 */
@Service
public class EmployeeInfoService {

	
	@Autowired
	private EmployeeInfoRepository employeeInfoRepository;

	public void addEmployeeInfo(EmployeeInfo employeeInfo) {
		employeeInfoRepository.save(employeeInfo);
	}

	/**
	 * @return all employee info
	 */
	public List<EmployeeInfo> getAllEmployeeInfo() {
		List<EmployeeInfo> employeeInfoList = new ArrayList<>();
		employeeInfoRepository.findAll().forEach(employeeInfoList::add);
		return employeeInfoList;
	}

	/**
	 * @param id
	 * @return employee info with particular id
	 */
	public EmployeeInfo getEmployeeInfo(Long id) {
		return employeeInfoRepository.findOne(id);
	}

	/**
	 * @param id
	 * 
	 * delete the user with the matching id
	 */
	public void deleteEmployeeInfo(Long id) {
		employeeInfoRepository.delete(id);
	}
	
	/**
	 * @param id
	 * @param employeeInfo
	 * @return updated employee info
	 */
	public ResponseEntity<EmployeeInfo> updateEmployeeInfo(Long id , EmployeeInfo employeeInfo) {
		EmployeeInfo employee = employeeInfoRepository.findOne(id);
		
		if (employee == null) {
			return ResponseEntity.notFound().build();
		}
		
		employee.setFirstName(employee.getFirstName());
		employee.setLastName(employee.getLastName());
		employee.setAddress(employee.getAddress());
		employee.setDesignation(employee.getDesignation());
		employee.setDob(employee.getDob());
		employee.setDoj(employee.getDoj());
		employee.setEmailId(employee.getEmailId());
		employee.setGender(employee.getGender());
		employee.setLoginDb(employee.getLoginDb());
		employee.setPhone(employee.getPhone());
		employee.setReportingManager(employee.getReportingManager());
		
		EmployeeInfo update = employeeInfoRepository.save(employee);
		
		return ResponseEntity.ok(update);
	}
}
