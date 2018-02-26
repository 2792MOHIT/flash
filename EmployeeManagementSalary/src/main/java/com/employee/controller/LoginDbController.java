package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.LoginDb;
import com.employee.service.LoginDbService;


@RestController
public class LoginDbController {
	
	@Autowired
	private LoginDbService loginDbService;
	
	@GetMapping("/login")
	public List<LoginDb> getAllLoginUser(){
		return loginDbService.getAllLoginUser();
	}
	
	@PostMapping("/login/add-user")
	public void addLoginUser(@RequestBody LoginDb loginDb) {
		loginDbService.addLoginUser(loginDb);
	}
	
	@GetMapping("/login/{id}")
	public LoginDb getLoginUser(@PathVariable String id) {
		return loginDbService.getLoginUser(id);
	}
	
	@DeleteMapping("/login/{id}")
	public void deleteLoginUser(@PathVariable String id) {
		loginDbService.deleteLoginUser(id);
	}
	
	
}
