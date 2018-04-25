package com.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "sid")
	private long sid;

	@Column(name = "salary")
	private float salary;

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "emp_id", referencedColumnName="emp_id") private
	 * EmployeeInfo empId;
	 */

	@Column(name = "emp_id")
	private long empId;

	public Salary() {
	}

	/**
	 * @return the sid
	 */
	public long getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the sid to set
	 */
	public void setSid(long sid) {
		this.sid = sid;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param totalSal
	 *            the salary to set
	 */
	public void setSalary(float totalSal) {
		this.salary = totalSal;
	}

	/**
	 * @return the empId
	 */
	public long getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(long empId) {
		this.empId = empId;
	}

}
