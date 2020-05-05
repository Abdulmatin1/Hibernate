package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;
import com.Entities.Review;

public class Delete_Courses_And_Review_Object3 {

	public static void main(String[] args) {

		// create SessionFactory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstractorDetails.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
			.buildSessionFactory();

		// create a Session

		Session theSession = factory.getCurrentSession();

		try {

			theSession.beginTransaction();
			 
			int id = 3;
			
			Course theCourse = theSession.get(Course.class, id);
			
			if(theCourse != null) {
				
				System.out.println(" Deleting This Course " + theCourse);
				theSession.delete(theCourse);
			}
 		
			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
