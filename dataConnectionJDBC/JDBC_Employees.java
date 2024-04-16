package com.dataConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Employees {

	public static void main(String[] args) {
		//data connection
		String db_url ="jdbc:mysql://localhost:3306";
		String user="root";
		String password="root";
		
		// establish the connection
		try {
			
			Connection connection = DriverManager.getConnection(db_url, user, password);
         // check connection
			if(connection!=null){
			
			System.out.println("Connection sucessfully");
		} else{
			
				System.out.println("connection unsucessfull");
			}
			//Perform the operation
			Statement stmt= connection.createStatement();
			String createDB = "create database db_employee2";
			String use="Use  db_employee2";
			String createTable="create table Database_EmployeeTable (empcode int,empname varchar(20),empage int,esalary int)";
			String  select= "Select * from Database_EmployeeTable";
			String insert = "insert into Database_EmployeeTable values (101, 'Jenny', 25,10000),"
					+"(102,'Jacky',30,20000),"+"(103,'joe',20,40000),"+"(104,'John',40,80000),"+"(105,'Shameer',25,90000)";
	       	//create DB	
			stmt.execute(createDB);
	       		// use db
	       		stmt.execute(use);
	       		// create table
			    stmt.execute(createTable);
	       		// update data
	       		stmt.executeUpdate(insert);
	       		// selecting data
	       		ResultSet rs= stmt.executeQuery(select);
	       		//print
	       		while(rs.next()){
	       			System.out.println(rs.getInt("empcode")+" "+rs.getString("empname")+" "+rs.getInt("empage")+rs.getInt("esalary"));
	       		}
	       		connection.close();
	       		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
