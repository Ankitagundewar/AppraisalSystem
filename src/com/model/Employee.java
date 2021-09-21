package com.model;

import java.util.Date;

public class Employee 
{
	private int employeeid;
	private int employeeSalary ;
	private String employeeDateOfJoining ;
	private String employeeCurrentRole ;
	private String employeeEmail ;
	private String employeeDepartment ;
	
	
	/*
	 * public Employee(int employeeid, int employeeSalary, String
	 * employeeDateOfJoining, String employeeCurrentRole, String employeeEmail,
	 * String employeeDepartment) { super(); this.employeeid = employeeid;
	 * this.employeeSalary = employeeSalary; this.employeeDateOfJoining =
	 * employeeDateOfJoining; this.employeeCurrentRole = employeeCurrentRole;
	 * this.employeeEmail = employeeEmail; this.employeeDepartment =
	 * employeeDepartment; }
	 */
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
	public String getEmployeeDateOfJoining() {
		return employeeDateOfJoining;
	}
	public void setEmployeeDateOfJoining(String employeeDateOfJoining) {
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
