package com.employee.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author mohit arya
 * @version 1.0
 * 
 * @category employee_info entity in database
 */

enum Gender {
	Male, Female
};

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
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name = "dob", nullable = false)
	private Date dob;

	@Column(name = "email_id", nullable = false)
	private String emailId;

	@OneToOne(targetEntity = DesigSal.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "designation", referencedColumnName = "designation")
	private DesigSal designation;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "doj", nullable = false)
	private Date doj;

	@OneToOne(targetEntity = EmployeeInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "reporting_manager", referencedColumnName = "emp_id")
	private EmployeeInfo reportingManager;

	@OneToOne(targetEntity = LoginDb.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_name", referencedColumnName = "user_name")
	private LoginDb userName;

	/**
	 * @return the empID
	 */
	public Long getEmpID() {
		return empID;
	}

	/**
	 * @param empID
	 *            the empID to set
	 */
	public void setEmpID(Long empID) {
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
	public DesigSal getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(DesigSal designation) {
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
	 * @return the reportingManager
	 */
	public EmployeeInfo getReportingManager() {
		return reportingManager;
	}

	/**
	 * @param reportingManager
	 *            the reportingManager to set
	 */
	public void setReportingManager(EmployeeInfo reportingManager) {
		this.reportingManager = reportingManager;
	}

	/**
	 * @return the loginDb
	 */
	public LoginDb getLoginDb() {
		return userName;
	}

	/**
	 * @param loginDb
	 *            the loginDb to set
	 */
	public void setLoginDb(LoginDb loginDb) {
		this.userName = loginDb;
	}

}
