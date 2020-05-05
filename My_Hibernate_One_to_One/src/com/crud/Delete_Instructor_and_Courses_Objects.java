package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.Course;
import com.hibernate.Entity.Instructor;
import com.hibernate.Entity.Instructor_Detail;
 

public class Delete_Instructor_and_Courses_Objects {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Detail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session theSession = factory.getCurrentSession();
		
		try {
			// begining the transaction
			theSession.beginTransaction();
			
		int theId = 35;
		
		Instructor theInstructor = theSession.get(Instructor.class, theId);
		
		theSession.delete(theInstructor);
		
		System.out.println("this is deleted instructor " + theInstructor);
			
			theSession.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
			
		} finally {
			theSession.close();
			
		}

	}

}
