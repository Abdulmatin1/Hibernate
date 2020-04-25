package com.factory.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.Student;

public class ReadObject {

	public static void main(String[] args) {
		// build a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create a session
		
		Session theSession = factory.getCurrentSession();
		
		try {
			 
			
			theSession.beginTransaction();
			
			int stduenid = 10;
			
			Student theStudent = theSession.get(Student.class, stduenid);
			
			System.out.println("this is the student information " + theStudent);
			
	System.out.println("=========================\n");
	
	
	System.out.println("this is the assciated student id " + theStudent.getFirtsName());
	
	theSession.getTransaction().commit();
	
	System.out.println("done");
			

	
			
		} finally {
			 factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
