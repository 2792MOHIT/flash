package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeInfo;
import com.employee.service.EmployeeInfoService;
import com.employee.wrapper.EmployeeInfoDto;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private EmployeeInfoService employeeInfoService;

	// adding the employee
	@PostMapping("/add")
	public void addEmployeeInfo(@RequestBody EmployeeInfoDto employeeInfoDto) throws Exception {
		employeeInfoService.addEmployeeInfo(employeeInfoDto);
	}

	// getting all the employees
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<EmployeeInfoDto> getAllEmployees() {
		return employeeInfoService.getAllEmployeeInfo();
	}

	// getting the particular employee
	@GetMapping("/get/{id}")
	public EmployeeInfo getEmployee(@PathVariable(name = "id") long id) {
		return employeeInfoService.getEmployeeInfo(id);
	}
}
