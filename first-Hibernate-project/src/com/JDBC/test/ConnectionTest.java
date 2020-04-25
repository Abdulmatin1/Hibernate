

package com.JDBC.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	
	
	
	public static void main(String[] args) {
		
		// this is our database url
		String databaseUrl = "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false";
		
		// this is our database username
		String userName = "matin";
		// this is our database password
		String Password = "1989";
		
		
		try {
			
			System.out.println("connectiong to Database..." + databaseUrl );
			
			Connection databaseConnection = DriverManager.getConnection(databaseUrl,userName,Password);
			
			System.out.println("we connected to our database throug JDBC");
			
			
	
		} catch (Exception e) {
			
			e.printStackTrace();
			 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
