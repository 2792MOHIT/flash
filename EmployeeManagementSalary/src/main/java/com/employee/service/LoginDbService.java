package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.LoginDb;
import com.employee.repository.LoginDbRepository;

@Service
public class LoginDbService {

	@Autowired
	private LoginDbRepository loginDbRepository;
	
	public List<LoginDb> getAllLoginUser() {
		List<LoginDb> loginDb = new ArrayList<>();
		loginDbRepository.findAll().forEach(loginDb:: add);
		return loginDb;
	}
	
	public LoginDb getLoginUser(String id) {
		return loginDbRepository.findOne(id);
	}
	
	public void addLoginUser(LoginDb loginDb) {
		loginDbRepository.save(loginDb);
	}
	
	public void deleteLoginUser(String id) {
		loginDbRepository.delete(id);
	}
}
