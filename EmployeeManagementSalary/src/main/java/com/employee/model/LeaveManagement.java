package com.employee.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * leave_management entity in database
 * 
 * @author mohit arya
 * @version 1.0
 * 
 */
@Entity
@Table(name="leave_management")
public class LeaveManagement {

	@Id	
	@OneToOne(targetEntity=EmployeeInfo.class,cascade=CascadeType.ALL)
	@JoinColumn(name = "emp_id", referencedColumnName="empid")
	private EmployeeInfo emp;
	
	@Column(name="sick_leave")
	private int sickleave;
	
	@Column(name="casual_leave")
	private int casualLeave;
	
	@Column(name="pr_leave")
	private int priveLeave;
	
	@Column(name="civil_leave")
	private int civil;
	
	@Column(name="maternity")
	private int maternity;
	
	@Column(name="paternity")
	private int paternity;
	
	@Column(name="marriage")
	private int marriage;
	
	@Column(name="paid leave")
	private int paidLeave;

	/**
	 * @return the emp
	 */
	public EmployeeInfo getEmp() {
		return emp;
	}

	/**
	 * @param emp the emp to set
	 */
	public void setEmp(EmployeeInfo emp) {
		this.emp = emp;
	}

	/**
	 * @return the sickleave
	 */
	public int getSickleave() {
		return sickleave;
	}

	/**
	 * @param sickleave the sickleave to set
	 */
	public void setSickleave(int sickleave) {
		this.sickleave = sickleave;
	}

	/**
	 * @return the casualLeave
	 */
	public int getCasualLeave() {
		return casualLeave;
	}

	/**
	 * @param casualLeave the casualLeave to set
	 */
	public void setCasualLeave(int casualLeave) {
		this.casualLeave = casualLeave;
	}

	/**
	 * @return the priveLeave
	 */
	public int getPriveLeave() {
		return priveLeave;
	}

	/**
	 * @param priveLeave the priveLeave to set
	 */
	public void setPriveLeave(int priveLeave) {
		this.priveLeave = priveLeave;
	}

	/**
	 * @return the civil
	 */
	public int getCivil() {
		return civil;
	}

	/**
	 * @param civil the civil to set
	 */
	public void setCivil(int civil) {
		this.civil = civil;
	}

	/**
	 * @return the maternity
	 */
	public int getMaternity() {
		return maternity;
	}

	/**
	 * @param maternity the maternity to set
	 */
	public void setMaternity(int maternity) {
		this.maternity = maternity;
	}

	/**
	 * @return the paternity
	 */
	public int getPaternity() {
		return paternity;
	}

	/**
	 * @param paternity the paternity to set
	 */
	public void setPaternity(int paternity) {
		this.paternity = paternity;
	}

	/**
	 * @return the marriage
	 */
	public int getMarriage() {
		return marriage;
	}

	/**
	 * @param marriage the marriage to set
	 */
	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	/**
	 * @return the paidLeave
	 */
	public int getPaidLeave() {
		return paidLeave;
	}

	/**
	 * @param paidLeave the paidLeave to set
	 */
	public void setPaidLeave(int paidLeave) {
		this.paidLeave = paidLeave;
	}
	
	

}
