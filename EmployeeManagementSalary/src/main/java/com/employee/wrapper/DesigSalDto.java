package com.employee.wrapper;

import com.employee.enums.Designation;
import com.employee.model.DesigSal;

/**
 * @author Mohit Arya
 *
 */
public class DesigSalDto {

	private Designation designation;
	private int basicSal;

	/**
	 * @param desigSal
	 */
	public DesigSalDto(DesigSal desigSal) {
		this.designation = desigSal.getDesignation();
		this.basicSal = desigSal.getBasicSal();
	}

	/**
	 * @return the designation
	 */
	public Designation getDesignation() {
		return designation;
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

}
