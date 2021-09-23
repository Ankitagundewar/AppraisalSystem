package com.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/appraisalsystem";
	public static final String USER="root";
	public static final String PASS="";
	public static Connection getConnection() throws SQLException
	{
		Connection connection=null;
		connection=DriverManager.getConnection(JDBC_URL,USER,PASS);
		return connection;
	}		
}

