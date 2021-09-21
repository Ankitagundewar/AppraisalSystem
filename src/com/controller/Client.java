package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.Dao.EmployeeDao;
import com.model.Employee;
import com.model.EmployeePersonalDetail;

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
        	System.out.println("3.Exit");
        	System.out.println("----------------------------------------------------------------");
        	System.out.println("\nEnter choice:");
        	ch=sc.nextInt();  
        	switch(ch)
        	{
        		case 1 :
        		{
        				EmployeePersonalDetail epd=new EmployeePersonalDetail();
        				System.out.println("Enter Employee Id :");
        				int eid=sc.nextInt();
        				epd.setEmployeeid(eid);
        				System.out.println("Enter Employee First Name :");
        				epd.setEmployeeFirstName(sc.next());
        				System.out.println("Enter Employee Last Name :");
        				epd.setEmployeeLastName(sc.next());
        				System.out.println("Enter Employee Address :");
        				epd.setEmployeeAddress(sc.next());
        				System.out.println("Enter Employee Age:");
        				epd.setEmployeeAge(sc.nextInt());
        				System.out.println("Enter Employee DOB :");
        				epd.setEmployeeDOB(sc.next());      			
					 
        				EmployeeDao ed=new EmployeeDao();
        				if(ed.insertEmployeeDetail(epd)>0)
        					System.out.println("record inserted in Employee personal Detail");
        				Employee e=new Employee();
        			
        				e.setEmployeeid(eid);
        				System.out.println("Enter Employee Salary :");
        			 	e.setEmployeeSalary(sc.nextInt());
					  	System.out.println("Enter Employee Date Of Joining :");
					  	e.setEmployeeDateOfJoining(sc.next());
					  	System.out.println("Enter Employee Current Role :");
					  	e.setEmployeeCurrentRole(sc.next());
					  	System.out.println("Enter Employee Email ID :");
					  	e.setEmployeeEmail(sc.next());
					  	System.out.println("Enter Employee Department :");
					  	e.setEmployeeDepartment(sc.next()); 
					  	if(ed.insertEmployee(e)>0)
					  			System.out.println("record inserted in Employee");
        			break;
        			}
        			case 2:
        				System.out.println("1.display All Employee");
        				System.out.println("2.delete Employee");
        	        	System.out.println("3.update Employee");
        	        	System.out.println("----------------------------------------------------------------");
        	        	System.out.println("\nEnter choice:");
        	        	int ch1=sc.nextInt();  
        	        	switch(ch1)
        	        	{
        	        		case 1 :
        	        			break;
        	        		case 2:
        	        			EmployeeDao ed=new EmployeeDao();
                				System.out.println("Enter id to delete the record:");
                				ed.deleteRecord(sc.nextInt());
                				System.out.println("record deleted successfully");
                				break;
                		}
        			break;	
        		}
        }while(ch<3);
	}

}
