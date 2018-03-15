package com.employee.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.employee.enums.Designation;

/**
 * @author mohit arya
 * @version 1.0
 * 
 * @category desig_sal entity in database
 */

@Entity
@Table(name = "desig_sal")
public class DesigSal {

	@Id
	@Column(name = "designation", nullable = false, updatable = true)
	@Enumerated(EnumType.STRING)
	private Designation designation;

	@Column(name = "basic_salary", nullable = false, updatable = true)
	private int basicSal;

	@OneToMany(mappedBy = "designation")
	private List<EmployeeInfo> emp;

	/**
	 * @return the designation
	 */
	public Designation getDesignation() {
		return designation;
	}

	public DesigSal() {

	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	/**
	 * @return the basicSal
	 */
	public int getBasicSal() {
		return basicSal;
	}

	/**
	 * @param basicSal
	 *            the basicSal to set
	 */
	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}

	/**
	 * @return the emp
	 */
	public List<EmployeeInfo> getEmp() {
		return emp;
	}

	/**
	 * @param emp
	 *            the emp to set
	 */
	public void setEmp(List<EmployeeInfo> emp) {
		this.emp = emp;
	}

}
