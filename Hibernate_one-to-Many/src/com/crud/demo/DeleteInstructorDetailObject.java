package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class DeleteInstructorDetailObject {

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
 
			int theId = 16;
			
			InstractorDetails theInstractorDetails = theSession.get(InstractorDetails.class, theId);
			
			if(theInstractorDetails !=null) {
				
				System.out.println("deleting the instructor Detail " + theInstractorDetails);
				
				// this line of code keep the instructor and let the instructordetails remove
				
				theInstractorDetails.getInstructor().setInstructor_Detail(null);
				
				theSession.delete(theInstractorDetails);
				
				System.out.println("==========================\n");
				
				System.out.println(" the instructo detail is deleted with id  "+ theInstractorDetails);
			}
			

			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
