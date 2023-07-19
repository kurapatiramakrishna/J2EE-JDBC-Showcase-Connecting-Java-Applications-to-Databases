package org.jspiders.jdbcprogramms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retriveData 
{
	public static void main(String[] args) 
	{
		   //to create a platform and connect to mysql workbench
		   String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		   String query="select * from ramakrishna.employee  where eid=2";
		try 
		{
			//establish the connection
		  	Connection connection=DriverManager.getConnection(url);
		  	//connection established
		  	System.out.println("establish the connection");
		  	
		  	Statement statement=connection.createStatement();
			//platform created
		  	System.out.println("platform created");
		  
		  	ResultSet rs=statement.executeQuery(query);
		  	
		  	boolean status=rs.next();
		  
		  	if (status)
		  	{
				System.out.println("record is present");
				//retrive the data
				int eid=rs.getInt("EID");
				String ename=rs.getString("ENAME");
				String esalary=rs.getString("ESALARY");
				int edeptno=rs.getInt("EDEPTNO");
				
				//print the data
				System.out.println("eid :"+eid);
				System.out.println("ename :"+ename);
				System.out.println("esalary :"+esalary);
				System.out.println("edeptno:"+edeptno);
				
				
			}
		  	else
		  	{
		  		System.err.println("No record is found");
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


