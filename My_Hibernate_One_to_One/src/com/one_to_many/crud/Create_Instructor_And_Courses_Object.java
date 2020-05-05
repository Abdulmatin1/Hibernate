package com.one_to_many.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.Class;
 
import com.hibernate.Entity.Instructor;
import com.hibernate.Entity.Instructor_Detail;

 

public class Create_Instructor_And_Courses_Object {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Detail.class)
				.addAnnotatedClass(Class.class)
				.buildSessionFactory();
		
		Session theSession = factory.getCurrentSession();
		
		try {
			// begining the transaction
			theSession.beginTransaction();
			
			Instructor theInstructor = new Instructor("Samir", "Khabuli", "Kazim");
			
			theSession.save(theInstructor);
			
			Class theCourse = new Class("HTML");
			
			theInstructor.addallCourses(theCourse);
			
			theSession.save(theCourse);

			
			theSession.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
			
		} finally {
			theSession.close();
			
			factory.close();
			
		}

	}

}
