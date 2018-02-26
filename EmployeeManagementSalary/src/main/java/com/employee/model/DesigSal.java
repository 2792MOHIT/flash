package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mohit arya
 * @version 1.0
 * 
 * @category desig_sal entity in database
 */
@Entity
@Table(name="desig_sal")
public class DesigSal {
	
	@Id
	@Column(name="designation")
	private String designation;
	
	@Column(name="basic_salary",nullable=false)
	private int basicSal;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}
	
	
}
