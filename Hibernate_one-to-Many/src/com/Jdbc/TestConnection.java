package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {

		String DatabaseUrl = "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false";
		String UserName = "matin";
		String password = "1989";

		try {

			System.out.println("connecting to " + DatabaseUrl);

			Connection connect = DriverManager.getConnection(DatabaseUrl, UserName, password);

			System.out.println("connected to my database");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
