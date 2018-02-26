package com.employee.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_info")
public class EmployeeInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Long empID;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "dob", nullable = false)
	private Date dob;

	@Column(name = "email_id", nullable = false)
	private String emailId;

	@Column(name = "designation", nullable = false)
	private String designation;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "phone", nullable = false)
	private Long phone;

	@Column(name = "hire_date", nullable = false)
	private Date hireDate;

	@Column(name = "report_manager")
	private Long reportManager;

	@OneToOne(targetEntity=LoginDb.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_name", referencedColumnName="user_name")
	private LoginDb loginDb;
	
	
	public LoginDb getLoginDb() {
		return loginDb;
	}


	public void setLoginDb(LoginDb loginDb) {
		this.loginDb = loginDb;
	}


	public EmployeeInfo() {
	}
	

	public Long getEmpID() {
		return empID;
	}

	public void setEmpID(Long empID) {
		this.empID = empID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Long getReportManager() {
		return reportManager;
	}

	public void setReportManager(Long reportManager) {
		this.reportManager = reportManager;
	}

}
