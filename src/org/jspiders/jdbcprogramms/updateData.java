package org.jspiders.jdbcprogramms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateData 
{ 
	public static void main(String[] args) 
{
	   //to create a platform and connect to mysql workbench
	   String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	   String query="update ramakrishna.employee set esalary=50000 where eid=2";
	try 
	{
		//establish the connection
	  	Connection connection=DriverManager.getConnection(url);
	  	//connection established
	  	System.out.println("establish the connection");
	  	
	  	Statement statement=connection.createStatement();
		//platform created
	  	
	  	int record=statement.executeUpdate(query);
	  	System.out.println("number of records updated :"+record);
	  	if (record>0)
	  	{
			System.out.println("record is updated");
		}
	  	else
	  	{
	  		System.err.println("No record is updated");
	  		connection.close();
	  	}
	} 
	catch (SQLException e) 
	{
		//to trace connection
		e.printStackTrace();
	}
}
}
