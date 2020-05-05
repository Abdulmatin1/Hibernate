package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class CreateCoursesObject {

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
			int theId = 19;
			
			Instructor theInstructor = theSession.get(Instructor.class, theId);
			
			
			Course myCourse = new Course("Softwear Development");
			Course myCourse2 = new Course("UI UX");
			
			theInstructor.add(myCourse);
			theInstructor.add(myCourse2);
			
		 
			// Save the object

	  theSession.save(myCourse);
	  theSession.save(myCourse2);
		  
			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
