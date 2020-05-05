package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class CreateObject {

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
 
			Instructor  theInstructor4 = new Instructor("A", "B", "A@gmail.com");
		 
			InstractorDetails theInstractorDetails4 = new InstractorDetails("Rabany", "Engineering");
		 
			theInstructor4.setInstructor_Detail(theInstractorDetails4);
			// Save the object

	 
			theSession.save(theInstructor4);
			
	 
			System.out.println("instractor inforamtion " + theInstructor4);
		 
			System.out.println("instractor detail information " + theInstractorDetails4);
			

			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
