package com.employee.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mohit arya
 * @version 1.0
 * 
 * @category login entity in database
 */

enum Role{Admin,Hr,Employee};

@Entity
@Table(name = "login_table")
public class LoginDb {
	
	@Id
	@Column(name = "user_name", nullable = false, updatable = false)
	private String userName;

	@Column(name = "password",nullable = false)
	private String password;

	@Column(name = "role",nullable = false)
	@Enumerated(EnumType.STRING)
	private Role role;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	

}
