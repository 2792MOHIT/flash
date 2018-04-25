package com.employee.wrapper;

import com.employee.model.LeaveManagement;

public class LeaveManagementDto {

	private int leaveId;
	private int sickleave;
	private int casualLeave;
	private int priveLeave;
	private int maternity;
	private int paternity;
	private int marriage;
	private int paidLeave;

	public LeaveManagementDto(LeaveManagement leaveManagement) {
		this.leaveId = leaveManagement.getLeaveId();
		this.sickleave = leaveManagement.getSickleave();
		this.casualLeave = leaveManagement.getCasualLeave();
		this.priveLeave = leaveManagement.getPriveLeave();
		this.maternity = leaveManagement.getMaternity();
		this.paternity = leaveManagement.getPaternity();
		this.marriage = leaveManagement.getMarriage();
		this.paidLeave = leaveManagement.getPaidLeave();
	}

	/**
	 * @return the leaveId
	 */
	public int getLeaveId() {
		return leaveId;
	}

	/**
	 * @param leaveId
	 *            the leaveId to set
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
	 * @param sickleave
	 *            the sickleave to set
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
	 * @param casualLeave
	 *            the casualLeave to set
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
	 * @param priveLeave
	 *            the priveLeave to set
	 */
	public void setPriveLeave(int priveLeave) {
		this.priveLeave = priveLeave;
	}

	/**
	 * @return the maternity
	 */
	public int getMaternity() {
		return maternity;
	}

	/**
	 * @param maternity
	 *            the maternity to set
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
	 * @param paternity
	 *            the paternity to set
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
	 * @param marriage
	 *            the marriage to set
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
	 * @param paidLeave
	 *            the paidLeave to set
	 */
	public void setPaidLeave(int paidLeave) {
		this.paidLeave = paidLeave;
	}

}
