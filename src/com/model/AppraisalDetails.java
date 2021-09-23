package com.model;

public class AppraisalDetails 
{
	private int appraisalid;
	private int employeeid;
	private String appraisaldate;
	private int oldroleid;
	private int newroleid;
	private String performance;
	public int getAppraisalid() {
		return appraisalid;
	}
	public void setAppraisalid(int appraisalid) {
		this.appraisalid = appraisalid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	
	public String getAppraisaldate() {
		return appraisaldate;
	}
	public void setAppraisaldate(String appraisaldate) {
		this.appraisaldate = appraisaldate;
	}
	public int getOldroleid() {
		return oldroleid;
	}
	public void setOldroleid(int oldroleid) {
		this.oldroleid = oldroleid;
	}
	public int getNewroleid() {
		return newroleid;
	}
	public void setNewroleid(int newroleid) {
		this.newroleid = newroleid;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	@Override
	public String toString() {
		return "AppraisalDetails [appraisalid=" + appraisalid + ", employeeid=" + employeeid + ", appraisaldate="
				+ appraisaldate + ", oldroleid=" + oldroleid + ", newroleid=" + newroleid + ", performance="
				+ performance + "]";
	}
	
	
}
