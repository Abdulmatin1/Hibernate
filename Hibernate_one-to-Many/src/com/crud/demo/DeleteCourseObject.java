package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class DeleteCourseObject {

	public static void main(String[] args) {

		// create SessionFactory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstractorDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		// create a Session

		Session theSession = factory.getCurrentSession();

		try {

			theSession.beginTransaction();
 
		 int id = 11;
		 
		 Course theCourse = theSession.get(Course.class, id);
		 
		 if(theCourse != null) {
			 
			 theSession.delete(theCourse);
			 
			 System.out.println(theCourse);
		 }

			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
