package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.configuration.ConnectionFactory;

public class EmployeeDao
{
	 static Statement st;
		static ResultSet rs; 
		static Connection con;
		static PreparedStatement pst;
		public EmployeeDao() throws SQLException
		{
			con = ConnectionFactory.getConnection();
			//System.out.println("Connection Acheived");
		}

	
		public int insertEmployee(int id,String s1,String s2,String jdate,int sal,int age,String city,String email,int roleid,String dept) 
		{
			
			 int r=0;
			try(PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?,?)");  	)
			{
				pst.setInt(1,id);
				pst.setString(2, s1);
				pst.setString(3, s2);
				pst.setString(4, jdate);
				pst.setInt(5, sal);
				pst.setInt(6, age);
				pst.setString(7, city);
				pst.setString(8, email);
				pst.setInt(9, roleid);
				pst.setString(10, dept);
				 r = pst.executeUpdate();
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
			
			return r;
		}
		public void displayAllEmployee()
		{
			try( Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select * from employee");	)
			{
				System.out.println("employeeid"+"\t"+"FirstName:"+"\t"+"lastname"+"\t"+" joiningdate"+"\t"+"salary"+"\t"+"Age"+"\t"+"city"+"\t"+"email"+"\t"+"currentroleid"+"\t"+"deptpartment");
				while(rs.next())
				{
					int id=rs.getInt(1);
					String s1=rs.getString(2);
					String s2=rs.getString(3);
					String jdate=rs.getString(4);
					int sal=rs.getInt(5);
					int age=rs.getInt(6);
					String city=rs.getString(7);
					String email=rs.getString(8);
					int roleid=rs.getInt(9);
					String dept=rs.getString(10);
					
					System.out.println(id+"\t"+s1+"\t"+s2+"\t"+jdate+"\t"+sal+"\t"+age+"\t"+city+"\t"+email+"\t"+roleid+"\t"+dept);
					
				}
			}
			catch(SQLException e)
			{
					System.out.println(e.getMessage());
			}
			
		}
		
	public int deleteEmployee(int id) 
	{
		int r=0;
		
		try
		{
			PreparedStatement pst = con.prepareStatement("delete from Employee where employeeid=?  ");
			pst.setInt(1, id);
			r = pst.executeUpdate();
			System.out.println("Number of rows deleted : " + r);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	return r;
	}
	public int updateEmployee(int sal,int role,int id) throws SQLException 
	{
		int r=0;
		try(PreparedStatement pst = con.prepareStatement("update Employee set salary = ? ,currentroleid=? where employeeid=?");)
		{
		pst.setInt(1, sal);
		pst.setInt(2, role);
		pst.setInt(3, id);
		r = pst.executeUpdate();
		
		System.out.println("Number of rows updated : " + r);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	return r;
	}
	public void  insertAppraisalDetail(int id,int empid,String str,String date)
	 {                                         
		
	 try(Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);           
	 ResultSet rs = st.executeQuery("Select * from employee");         
	 Statement st1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);        
	     ResultSet rs1 = st1.executeQuery("Select * from appraisaldetails");)
	 {
		 int r=0;
		 int oldrole =0;

			while (rs.next()) {
				if (rs.getInt(1) == empid) {
					oldrole = rs.getInt(9);
				}
			}

			int newrole;
			if (str.equals("A+"))
				newrole = oldrole + 2;
			else if (str.equals("A"))
				newrole = oldrole + 1;
			else
				newrole = oldrole;
			
			if(newrole>6)
			{
				newrole=6;
			}
			updateEmp(empid,newrole);
			try (PreparedStatement pst = con.prepareStatement("insert into appraisaldetails values(?,?,?,?,?,?)");)
			{
				pst.setInt(1, id);
				pst.setInt(2, empid);
				pst.setString(3, date);
				pst.setInt(4, oldrole);
				pst.setInt(5, newrole);
				pst.setString(6, str);
				r = pst.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	 catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	private void updateEmp(int empid,int newrole) 
	{
		int r=0;
		try(PreparedStatement pst = con.prepareStatement("update Employee set currentroleid=? where employeeid=?");)
		{
		pst.setInt(1, newrole);
		pst.setInt(2, empid);
		r = pst.executeUpdate();
		
		System.out.println("current role id updated for empid: "+empid);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void display() 
	{
		try( Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select a1.empid,e3.* from appraisaldetails a1 join appraisaldetails a2 \r\n"
				+ "on a1.empid=a2.empid and a1.oldroleid=1 and a2.newroleid=5 and a1.newroleid=a2.oldroleid\r\n"
				+ "join employee e3 on e3.employeeid = a1.empid;   \r\n"
				+ "");	)
		{
			while(rs.next())
			{
				System.out.println("empid : "+rs.getString(1) + "\n"+"employeeid : "+ rs.getString(2)+"\n"+"FirstName : "
			+rs.getString(3)+"\n"+"lastname : "+ rs.getString(4) +"\n"+"joiningdate : "+ rs.getString(5) +"\n"+"salary : "
						+ rs.getString(6) +"\n"+"Age : "+ rs.getString(7) +"\n"+"city : "+ rs.getString(8) +"\n"+"email : "
			+ rs.getString(9) +"\n"+"currentroleid : "+ rs.getString(10) +"\n"+"deptpartment : "+ rs.getString(11));
				
			}
		}
		catch(SQLException e)
		{
				System.out.println(e.getMessage());
		}
	}
	public void displayEmpWithMaxAppraisal()
	{
		
		try( Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select * from employee where employeeid = (select empid from appraisaldetails group by empid order by count(*) desc limit 1);"
				+ "");	)
		{
			while(rs.next())
			{
				System.out.println("employeeid : "+ rs.getString(1)+"\n"+"FirstName : "
						+rs.getString(2)+"\n"+"lastname : "+ rs.getString(3) +"\n"+"joiningdate : "+ rs.getString(4) +"\n"+"salary : "
									+ rs.getString(5) +"\n"+"Age : "+ rs.getString(6) +"\n"+"city : "+ rs.getString(7) +"\n"+"email : "
						+ rs.getString(8) +"\n"+"currentroleid : "+ rs.getString(9) +"\n"+"deptpartment : "+ rs.getString(10));
			}
		}
		catch(SQLException e)
		{
				System.out.println(e.getMessage());
		}
	}


	public void displayRoleNotChnageAfterAppraisal()
	{
		try( Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select e.employeeid,e.firstname ,e.lastname from employee e inner join appraisaldetails a on e.employeeid=a.empid where oldroleid=newroleid;");)
		{
			/*
			 * +"\n"+"joiningdate : "+ rs.getString(4) +"\n"+"salary : " + rs.getString(5)
			 * +"\n"+"Age : "+ rs.getString(6) +"\n"+"city : "+ rs.getString(7)
			 * +"\n"+"email : " + rs.getString(8) +"\n"+"currentroleid : "+ rs.getString(9)
			 * +"\n"+"deptpartment : "+ rs.getString(10)
			 */
			while(rs.next())
			{
				System.out.println("employeeid : "+ rs.getString(1)+"\n"+"FirstName : "
						+rs.getString(2)+"\n"+"lastname : "+ rs.getString(3));
				System.out.println("-------------------------------------------------------");
			}
		}
		catch(SQLException e)
		{
				System.out.println(e.getMessage());
		}
	}


	public void displayEmployeeDidNotHaveAppraisal() 
	{
		try( Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select employeeid,firstname,lastname from employee a left join appraisaldetails b on a.employeeid=b.empid where isnull(b.empid);");)
		{
			while(rs.next())
			{
				System.out.println("employeeid : "+ rs.getString(1)+"\n"+"FirstName : "
						+rs.getString(2)+"\n"+"lastname : "+ rs.getString(3));
				System.out.println("-------------------------------------------------------");
			}
		}
		catch(SQLException e)
		{
				System.out.println(e.getMessage());
		}
	}
	
	
}
