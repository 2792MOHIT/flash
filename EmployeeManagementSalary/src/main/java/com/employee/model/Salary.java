package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salary")
public class Salary {
	
	@Id
	@Column(name="sid")
	private long sid;
	
	@Column(name = "salary")
	private long salary;
	
	@OneToOne
	@JoinColumn(name = "emp_id", referencedColumnName="emp_id")
	private EmployeeInfo empId;
	
	public Salary() {
	}

	/**
	 * @return the sid
	 */
	public long getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(long sid) {
		this.sid = sid;
	}

	/**
	 * @return the salary
	 */
	public long getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
}
