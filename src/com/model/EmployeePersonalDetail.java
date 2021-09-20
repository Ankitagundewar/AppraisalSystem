package com.model;

import java.util.Date;

public class EmployeePersonalDetail 
{
	private int employeeid ;
	private String employeeFirstName ;
	private String employeeMiddleName ;
	private String employeeLastName ;
	private String employeeAddress ;
	private int employeeAge ;
	private Date employeeDOB ;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeMiddleName() {
		return employeeMiddleName;
	}
	public void setEmployeeMiddleName(String employeeMiddleName) {
		this.employeeMiddleName = employeeMiddleName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public Date getEmployeeDOB() {
		return employeeDOB;
	}
	public void setEmployeeDOB(Date employeeDOB) {
		this.employeeDOB = employeeDOB;
	}
	@Override
	public String toString() {
		return "EmployeePersonalDetail [employeeid=" + employeeid + ", employeeFirstName=" + employeeFirstName
				+ ", employeeMiddleName=" + employeeMiddleName + ", employeeLastName=" + employeeLastName
				+ ", employeeAddress=" + employeeAddress + ", employeeAge=" + employeeAge + ", employeeDOB="
				+ employeeDOB + "]";
	}
	
}
