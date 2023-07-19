package org.jspiders.jdbcprogramms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertDataUsingScannerClass
{
	public static void main(String[] args)
	  {
		  String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		   String query="insert into ramakrishna.employee values(?,?,?,?)";
		   try
		   {
			Connection connection=DriverManager.getConnection(url);
			//create a prepared statement platform
			
			PreparedStatement ps=connection.prepareStatement(query);
			//take the input from  the user
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the employee eid");
			int empid=scan.nextInt();
			ps.setInt(1, empid);
			
			System.out.println("Enter the employee ename");
			String ename=scan.next();
			ps.setString(2, ename);
			
			System.out.println("Enter the employee esalary");
			double salary=scan.nextDouble();
			ps.setDouble(3, salary);
			
			System.out.println("Enter the emlloyee edeptno");
			int deptno=scan.nextInt();
			ps.setInt(4, deptno);
			
			ps.executeUpdate();
			System.out.println("Register Successfully...");
			
			//close the connection
			connection.close();
			} 
		   catch (SQLException e)
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	}


