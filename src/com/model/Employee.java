package com.model;

public class Employee 
{
	private int employeeid;
	private String firstname;
	private String lastname;
	private String joiningdate ;
	private int salary ;
	private int age;
	private String city;
	private String emailid ;
	private int currentroleid;
	private String department ;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getCurrentroleid() {
		return currentroleid;
	}
	public void setCurrentroleid(int currentroleid) {
		this.currentroleid = currentroleid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", joiningdate=" + joiningdate + ", salary=" + salary + ", age=" + age + ", city=" + city
				+ ", emailid=" + emailid + ", currentroleid=" + currentroleid + ", department=" + department + "]";
	}
	
	
}	
