package org.jspiders.jdbcprogramms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertData 
{
 public static void main(String[] args)
 {
	String url="jdbc:mysql://localhost:3306?user=root&password=12345";
	//insert the data into sql workbench
	String query="insert into ramakrishna.employee values(1,'ramakrishna',1500,10)";
	String query1="insert into ramakrishna.employee values(2,'ramakrishna',1800,20)";
	String query2="insert into ramakrishna.employee values(3,'krishna',1900,30)";
	String query3="insert into ramakrishna.employee values(4,'vamshi',1300,40)";
	String query4="insert into ramakrishna.employee values(5,'vamshisingam',1300,50)";
	
	
	try 
	{
		Connection connection=DriverManager.getConnection(url);
		System.out.println("connecton established");
		// to create a platform
		Statement statement=connection.createStatement();
		//platform created
		statement.executeUpdate(query);
		statement.executeUpdate(query1);
		statement.executeUpdate(query2);
		statement.executeUpdate(query3);
		statement.executeUpdate(query4);
		System.out.println("query executed and record inserted into table ");
		//close the connection
		connection.close();
		System.out.println("connection closed");
	} 
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
  }
}
