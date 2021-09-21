package com.model;

import java.util.Date;

public class Appraisal
{
	private int employeeid ;
	private Date appraisalDate ;
	private String oldRole;
	public String getOldRole() {
		return oldRole;
	}
	public void setOldRole(String oldRole) {
		this.oldRole = oldRole;
	}
	private String newRole ;
	private int noOfApprisal ;
	private String appraisalFeedback ;
	private String employeePerformance ;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public Date getAppraisalDate() {
		return appraisalDate;
	}
	public void setAppraisalDate(Date appraisalDate) {
		this.appraisalDate = appraisalDate;
	}
	
	public String getNewRole() {
		return newRole;
	}
	public void setNewRole(String newRole) {
		this.newRole = newRole;
	}
	public int getNoOfApprisal() {
		return noOfApprisal;
	}
	public void setNoOfApprisal(int noOfApprisal) {
		this.noOfApprisal = noOfApprisal;
	}
	public String getAppraisalFeedback() {
		return appraisalFeedback;
	}
	public void setAppraisalFeedback(String appraisalFeedback) {
		this.appraisalFeedback = appraisalFeedback;
	}
	public String getEmployeePerformance() {
		return employeePerformance;
	}
	public void setEmployeePerformance(String employeePerformance) {
		this.employeePerformance = employeePerformance;
	}
	@Override
	public String toString() {
		return "Appraisal [employeeid=" + employeeid + ", appraisalDate=" + appraisalDate + ", oldRole=" + oldRole
				+ ", newRole=" + newRole + ", noOfApprisal=" + noOfApprisal + ", appraisalFeedback=" + appraisalFeedback
				+ ", employeePerformance=" + employeePerformance + "]";
	}
	
	
}
