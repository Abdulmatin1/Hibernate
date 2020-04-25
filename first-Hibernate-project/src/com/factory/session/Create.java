package com.factory.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.Student;

public class Create {

	public static void main(String[] args) {
		// build a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create a session
		
		Session theSession = factory.getCurrentSession();
		
		try {
			
			System.out.println("creating student object");
			
			Student theStudent1 = new Student("JAWID", "IQBAL", "JAVED@gmail.com");
			Student theStudent2 = new Student("Shaba", "Sahibzada", "Sahibzada@gmail.com");
			Student theStudent3 = new Student("Sana", "walizada", "sana@gmail.com");
			Student theStudent4 = new Student("Roman", "Mir", "Roman@gmail.com");
			
			// begin transaction
			
			theSession.beginTransaction();
			
			// save the Student object
			
			theSession.save(theStudent1);
			theSession.save(theStudent2);
			theSession.save(theStudent3);
			theSession.save(theStudent4);
			
			// commite transaction
			
			theSession.getTransaction().commit();
			
			System.out.println("DONE");
			
		} finally {
			 factory.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
