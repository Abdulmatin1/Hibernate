package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test_JDBC_Connection {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/kayhan_academy?allowPublicKeyRetrieval=true&useSSL=false";
		String user = "matin";
		String pass = "1989";
				
				try {
					
					
					System.out.println("connecting to " + url);
					
					Connection con = DriverManager.getConnection(url,user,pass);
					
					System.out.println("connected....");
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
		
	}

}
