package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class DeleteInstructorObject {

	public static void main(String[] args) {

		// create SessionFactory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstractorDetails.class)
				.buildSessionFactory();

		// create a Session

		Session theSession = factory.getCurrentSession();

		try {

			theSession.beginTransaction();
 
			int theId = 10;
			
			Instructor courseInstructor = theSession.get(Instructor.class, theId);
			
			if(courseInstructor !=null) {
				
				System.out.println("deleting the instructor " + courseInstructor);
				
				theSession.delete(courseInstructor);
				
				System.out.println("==========================\n");
				
				System.out.println(" the instructo is deleted with id 5"+ courseInstructor);
			}
			

			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
