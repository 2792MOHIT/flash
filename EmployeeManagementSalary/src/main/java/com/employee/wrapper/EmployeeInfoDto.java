package com.employee.wrapper;

import java.util.Date;

import com.employee.enums.Gender;
import com.employee.model.DesigSal;
import com.employee.model.EmployeeInfo;
import com.employee.model.LeaveManagement;
import com.employee.model.LoginDb;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class EmployeeInfoDto {

	private long empID;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Date dob;
	private String emailId;
	private String designation;
	private String address;
	private String phone;
	private Date doj;
	private long repId;
	private LoginDb userId;
	private LeaveManagement leaveId;

	public EmployeeInfoDto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param empID
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param dob
	 * @param emailId
	 * @param designation
	 * @param address
	 * @param phone
	 * @param doj
	 * @param repId
	 * @param userId
	 * @param leaveId
	 */
	public EmployeeInfoDto(EmployeeInfo employeeInfo) {
		this.empID = employeeInfo.getEmpID();
		this.firstName = employeeInfo.getFirstName();
		this.lastName = employeeInfo.getLastName();
		this.gender = employeeInfo.getGender();
		this.dob = employeeInfo.getDob();
		this.emailId = employeeInfo.getEmailId();
		if (employeeInfo.getDesignation() != null && employeeInfo.getDesignation().getDesignation() != null) {
			this.designation = employeeInfo.getDesignation().getDesignation().toString();
		}
		this.address = employeeInfo.getAddress();
		this.phone = employeeInfo.getPhone();
		this.doj = employeeInfo.getDoj();
		if (employeeInfo.getReportingManager() != null) {
			this.repId = employeeInfo.getReportingManager().getEmpID();
		}
		this.userId = employeeInfo.getUserId();
		this.leaveId = employeeInfo.getLeaveId();
	}

	/**
	 * @return the empID
	 */
	public long getEmpID() {
		return empID;
	}

	/**
	 * @param empID
	 *            the empID to set
	 */
	public void setEmpID(long empID) {
		this.empID = empID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj
	 *            the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/**
	 * @return the repId
	 */
	public long getRepId() {
		return repId;
	}

	/**
	 * @param repId
	 *            the repId to set
	 */
	public void setRepId(long repId) {
		this.repId = repId;
	}

	/**
	 * @return the userId
	 */
	public LoginDb getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(LoginDb userId) {
		this.userId = userId;
	}

	/**
	 * @return the leaveId
	 */
	public LeaveManagement getLeaveId() {
		return leaveId;
	}

	/**
	 * @param leaveId
	 *            the leaveId to set
	 */
	public void setLeaveId(LeaveManagement leaveId) {
		this.leaveId = leaveId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeInfoDto [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dob=" + dob + ", emailId=" + emailId + ", designation=" + designation + ", address="
				+ address + ", phone=" + phone + ", doj=" + doj + ", repId=" + repId + ", userId=" + userId
				+ ", leaveId=" + leaveId + "]";
	}

}
