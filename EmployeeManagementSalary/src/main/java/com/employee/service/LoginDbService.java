package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.LoginDb;
import com.employee.repository.LoginDbRepository;

/**
 * @author mohit arya
 * @version 1.0
 *
 */
@Service
public class LoginDbService {

	@Autowired
	private LoginDbRepository loginDbRepository;

	@Autowired
	private EmployeeInfoService employeeInfoService;

	public void updateLoginInfo(Long id, LoginDb user) {
		String userName = employeeInfoService.getEmployeeInfo(id).getLoginDb().getUserName();

		LoginDb loginDb = loginDbRepository.findOne(userName);

		loginDb.setUserName(user.getUserName());
		loginDb.setPassword(user.getPassword());
		loginDb.setRole(user.getRole());

		loginDbRepository.save(loginDb);

	}
	
	public List<LoginDb> getLoginInfoAll() {
		List<LoginDb> list = new ArrayList<>();
		loginDbRepository.findAll().forEach(list :: add);
		
		return list;
	}
	
	public LoginDb getLoginDetail(Long id) {
		String userName = employeeInfoService.getEmployeeInfo(id).getLoginDb().getUserName();
		return loginDbRepository.findOne(userName);
	}
	
}
