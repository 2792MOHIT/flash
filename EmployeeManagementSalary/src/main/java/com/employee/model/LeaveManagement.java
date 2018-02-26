package com.employee.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author mohit arya
 * @version 1.0
 * 
 * @category leave_management entity in database
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
	
	

}
