package org.jspiders.jdbcprogramms;

import java.sql.*;
import java.util.Scanner;

public class loginIntoEmployeeData 
{
	   public static void main(String[] args) 
	   {
		  String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		   String query="SELECT * FROM ramakrishna.employee where EMAIL=? and PASSWORD=? ";
		   try 
		   {
			Connection connection=DriverManager.getConnection(url);	
			PreparedStatement ps=connection.prepareStatement(query);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the email:");
			String email=sc.next();
			System.out.println("Enter the password:");
			
			String password=sc.next();
			ps.setString(1,email);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if (rs.next())
			{
			 System.out.println("Login Successfull..!!");
			 System.out.println(rs.getString("ENAME") +" welcome to jdbc program");
			}
			else
			{
				System.out.println("Enter valid email and password");
				
			}
			connection.close();
		} 
		   catch (SQLException e)
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
