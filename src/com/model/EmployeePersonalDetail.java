package com.model;

import java.util.Date;

public class EmployeePersonalDetail 
{
	private int employeeid ;
	private String employeeFirstName ;
	private String employeeLastName ;
	private String employeeAddress ;
	private int employeeAge ;
	private String employeeDOB ;
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
	public String getEmployeeDOB() {
		return employeeDOB;
	}
	public void setEmployeeDOB(String string) {
		this.employeeDOB = string;
	}
	@Override
	public String toString() {
		return "EmployeePersonalDetail [employeeid=" + employeeid + ", employeeFirstName=" + employeeFirstName
				+ ", employeeLastName=" + employeeLastName + ", employeeAddress=" + employeeAddress + ", employeeAge="
				+ employeeAge + ", employeeDOB=" + employeeDOB + "]";
	}
	
	
}
