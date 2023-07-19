package org.jspiders.jdbcprogramms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class forgotPassword 
{
	 public static void main(String[] args) 
	   {
		  String url="jdbc:mysql://localhost:3306?user=root&password=12345";
		   String query="SELECT * FROM ramakrishna.employee where EMOBILENO=? ";
		   try 
		   {
			Connection connection=DriverManager.getConnection(url);	
			PreparedStatement ps=connection.prepareStatement(query);
			
			Scanner sc=new Scanner(System.in);
			boolean status=true;
			while (status) 
			{
				System.out.println("Enter the emobileno:");
				String emobileno=sc.next();
				ps.setString(1,emobileno);
		
			ResultSet rs=ps.executeQuery();
			if (rs.next())
			{
			
			 System.out.println("Your password is"+rs.getString("PASSWORD") );
			}
			else
			{
				System.out.println("Enter valid mobile number");
				status=false;
			}
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
