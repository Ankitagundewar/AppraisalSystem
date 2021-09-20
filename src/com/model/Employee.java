package com.model;

import java.util.Date;

public class Employee 
{
	private int employeeid;
	private int employeeSalary ;
	private Date employeeDateOfJoining ;
	private String employeeCurrentRole ;
	private String employeeEmail ;
	private String employeeDepartment ;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Date getEmployeeDateOfJoining() {
		return employeeDateOfJoining;
	}
	public void setEmployeeDateOfJoining(Date employeeDateOfJoining) {
		this.employeeDateOfJoining = employeeDateOfJoining;
	}
	public String getEmployeeCurrentRole() {
		return employeeCurrentRole;
	}
	public void setEmployeeCurrentRole(String employeeCurrentRole) {
		this.employeeCurrentRole = employeeCurrentRole;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeSalary=" + employeeSalary + ", employeeDateOfJoining="
				+ employeeDateOfJoining + ", employeeCurrentRole=" + employeeCurrentRole + ", employeeEmail="
				+ employeeEmail + ", employeeDepartment=" + employeeDepartment + "]";
	}
	
}
