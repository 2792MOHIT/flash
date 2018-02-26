package com.employee.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mohit arya
 * @version 1.0
 * 
 * @category login entity in database
 */
@Entity
@Table(name = "login_table")
public class LoginDb {

	@Id
	@Column(name = "user_name", nullable = false, updatable = false)
	private String userName;

	@Column(name = "password",nullable = false)
	private String password;

	@Column(name = "role",nullable = false)
	private String role;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
