package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.configuration.ConnectionFactory;
import com.model.Employee;
import com.model.EmployeePersonalDetail;

public class EmployeeDao {

	public int insertEmployee(Employee e) throws SQLException
	{
		int check = 0; // Class.forName("com.mysql.jdbc.Driver");
		Connection con = ConnectionFactory.getConnection();
		String sql = "insert into employee(employeeid,EmployeeSalary,EmployeeDateOfJoining,"
				+ "EmployeeCurrentRole,EmployeeEmail,EmployeeDepartment) values(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, e.getEmployeeid());
		pst.setInt(2, e.getEmployeeSalary());
		pst.setString(3, e.getEmployeeDateOfJoining());
		pst.setString(4, e.getEmployeeCurrentRole());
		pst.setString(5, e.getEmployeeEmail());
		pst.setString(6, e.getEmployeeDepartment());
		check = pst.executeUpdate();
		pst.close();
		con.close();
		return check;
	}

	

	public int insertEmployeeDetail(EmployeePersonalDetail epd) throws SQLException 
	{
		int check = 0;
		Connection con = ConnectionFactory.getConnection();
		String sql1 = "insert into employeePersonalDetail(employeeid,employeeFirstName,employeeLastName,employeeAddress, employeeAge , employeeDOB) values(?,?,?,?,?,?)";
		PreparedStatement pst1 = con.prepareStatement(sql1);
		
		pst1.setInt(1, epd.getEmployeeid());
		pst1.setString(2, epd.getEmployeeFirstName());
		pst1.setString(3, epd.getEmployeeLastName());
		pst1.setString(4, epd.getEmployeeAddress());
		pst1.setInt(5, epd.getEmployeeAge());
		pst1.setString(6, epd.getEmployeeDOB());
		check = pst1.executeUpdate();
		pst1.close();
		con.close();
		return check;
	}
	public int deleteRecord(int id) throws SQLException 
	{
		int r=0;
		Connection con = ConnectionFactory.getConnection();
		try
		{
			PreparedStatement pst = con.prepareStatement("delete from EmployeePersonalDetail  where employeeid=?  ");
			PreparedStatement pst1 = con.prepareStatement("delete from Employee  where employeeid=?  ");
			pst.setInt(1, id);
			pst1.setInt(1, id);
			r = pst.executeUpdate();
			r = pst1.executeUpdate();
			System.out.println("Number of rows deleted : " + r);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	return r;
	}

}
