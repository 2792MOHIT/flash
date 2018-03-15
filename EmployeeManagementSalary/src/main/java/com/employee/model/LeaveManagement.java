package com.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class LeaveManagement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="leave_id")
	private int leaveId;
	
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
	
	@Column(name="paid_leave")
	private int paidLeave;
	
	public LeaveManagement() {
		
	}

	/**
	 * @return the leaveId
	 */
	public int getLeaveId() {
		return leaveId;
	}

	/**
	 * @param leaveId the leaveId to set
	 */
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
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
