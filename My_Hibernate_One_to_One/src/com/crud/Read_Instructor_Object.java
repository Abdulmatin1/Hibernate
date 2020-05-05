package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.Entity.Instructor;
import com.hibernate.Entity.Instructor_Detail;
 

public class Read_Instructor_Object {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Detail.class)
				.buildSessionFactory();
		
		Session theSession = factory.getCurrentSession();
		
		try {
			// begining the transaction
			theSession.beginTransaction();
			
		  int id = 2;
		  
		  Instructor theInstructor = theSession.get(Instructor.class, id);
		  
		  System.out.println("this is the instructor  FORM tabel "  + theInstructor);
		  System.out.println("================\n");
		  
		System.out.println(  theInstructor.getFirstName());
		  
			theSession.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
			
		} finally {
			theSession.close();
			
		}

	}

}
