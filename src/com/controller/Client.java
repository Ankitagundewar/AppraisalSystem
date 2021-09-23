package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.model.AppraisalDetails;
import com.model.Employee;

public class Client {

	public static void main(String[] args) throws SQLException
	{
		Scanner sc= new Scanner(System.in);
        int ch=0;
        do
        {
        	System.out.println("--------------------------Apprisal  System-----------------------------");
        	System.out.println("1.New Employee");
        	System.out.println("2.Login");
        	System.out.println("3.Employee Appraisal");
        	System.out.println("4.Exit");
        	System.out.println("----------------------------------------------------------------");
        	System.out.println("\nEnter choice:");
        	ch=sc.nextInt();  
        	switch(ch)
        	{
        		case 1 :
        		{
        				EmployeeDao ed=new EmployeeDao();
        				Employee e=new Employee();
        				System.out.println("Enter Employee Id :");
        				int id=sc.nextInt();
        				System.out.println("Enter Employee First Name :");
        				String s1=sc.next();
        				System.out.println("Enter Employee Last Name :");
        				String s2=sc.next();
        				System.out.println("Enter Employee Date Of Joining :");
        				String jdate=sc.next();
        				System.out.println("Enter Employee Salary :");
        				int sal=sc.nextInt();
        			 	System.out.println("Enter Employee Age:");
        			 	int age=sc.nextInt();
        				System.out.println("Enter Employee City :");
        				String city=sc.next();
					  	System.out.println("Enter Employee Email ID :");
					  	String email=sc.next();
					  	System.out.println("Enter Employee Current Role Id:");
					  	int roleid=sc.nextInt();
					  	System.out.println("Enter Employee Department :");
					  	System.out.println("1.Developer 2.Testing 3.Cloud 4.AI ");
					  	String dept=sc.next(); 
					  	if(ed.insertEmployee(id,s1,s2,jdate,sal,age,city,email,roleid,dept)>0)
					  			System.out.println("record inserted in Employee");
							
        			break;
        		}
        		case 2:
        		{
        				System.out.println("1.Display All Employee");
        				System.out.println("2.Delete Employee");
        	        	System.out.println("3.Update Employee");
        	        	System.out.println("----------------------------------------------------------------");
        	        	System.out.println("\nEnter choice:");
        	        	int ch1=sc.nextInt();  
        	        	switch(ch1)
        	        	{
        	        		case 1:
        	        		{
        	        			EmployeeDao ed=new EmployeeDao();
        	        			System.out.println("Display All record:");
        	        			ed.displayAllEmployee();
        	        			break;
        	        		}
        	        		case 2:
        	        		{
        	        			EmployeeDao ed=new EmployeeDao();
                				System.out.println("Enter id to delete the record:");
                				int eid=sc.nextInt();
                				if(ed.deleteEmployee(eid)>0)
                					System.out.println("record deleted successfully");
                				break;
        	        		}
        	        		case 3:
        	        		{	
        	        			EmployeeDao empd=new EmployeeDao();
        	        			Employee e=new Employee();
        	        			System.out.println("Enter id to update the record:");
        	        			int eid=sc.nextInt();
        	        			System.out.println("Enter salary to update record of "+eid+" :");
        	        			int sal=sc.nextInt();
        	        			System.out.println("Enter role to update record of "+eid+" :");
        	        			
        	        			System.out.println("1.Intern 2.junior associate 3.senior associate 4.assistant manager 5.manager 6.senior manager");
                				if(empd.updateEmployee( sal,sc.next(),eid)>0)
                					System.out.println("record updated successfully");
        	        			break;
        	        		}
                		}
        			break;	
        		}
        		case 3:
        		{
        			System.out.println("1.Insert Appraisal Detail");
                	System.out.println("2.Display List of employees who joined as a intern and now are managers ");
                	System.out.println("3.Employee with maximum appraisals ");
                	System.out.println("4.Employees for who role was not changed after appraisal");
                	System.out.println("----------------------------------------------------------------");
                	System.out.println("\nEnter choice:");
                	ch=sc.nextInt();  
                	switch(ch)
                	{
                		case 1:
                		{
                			EmployeeDao ed=new EmployeeDao();
                			System.out.println("Enter Appraisal Id :");
            				int id=sc.nextInt();
            				System.out.println("Enter Employee Id :");
            				int eid=sc.nextInt();
            				System.out.println("Enter Employee Performance :");
            				String str=sc.next();
            				System.out.println("Enter Employee Appraisal Date :");
            				String date=sc.next();
                			ed.insertAppraisalDetail(id,eid,str,date);
                			break;
                		}
                		case 2:
                		{
                			EmployeeDao ed=new EmployeeDao();
                			ed.display();
                			break;
                		}
                		case 3:
                		{
                			EmployeeDao ed=new EmployeeDao();
                			ed.displayEmpWithMaxAppraisal();
                			break;
                		}
                		case 4:
                		{
                			EmployeeDao ed=new EmployeeDao();
                			ed.displayRoleNotChnageAfterAppraisal();
                			break;
                		}
                	}
        		}
        	}
        }while(ch<4);
	}

}
