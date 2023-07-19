package org.jspiders.jdbcprogramms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class establishConnection 
{
   public static void main(String[] args) 
   {
	   //to create a platform and connect to mysql workbench
	   //          protocol     :hostinfo  :portno   userinfo
	   String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	try 
	{
		//establish the connection
	  	Connection connection=DriverManager.getConnection(url);
	  	//connection established
	  	System.out.println("establish the connection");
	} 
	catch (SQLException e) 
	{
		//to trace connection
		e.printStackTrace();
	}
   }
}
