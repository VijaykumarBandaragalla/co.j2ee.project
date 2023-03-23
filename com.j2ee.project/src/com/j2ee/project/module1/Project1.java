package com.j2ee.project.module1;

import java.sql.*; 
//1st step of jdbc importing all the packages
public class Project1 {
	public static void main(String[] args) {
		Connection con = null;
//		2nd step of jdbc..!! load and register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered..!");
//			jdbc:mysql://localhost/?user=root&password=rootpassword
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("connection established between java and sql");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}