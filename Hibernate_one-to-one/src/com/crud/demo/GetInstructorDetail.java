package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class GetInstructorDetail {

	public static void main(String[] args) {

		// create SessionFactory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstractorDetails.class).buildSessionFactory();

		// create a Session

		Session theSession = factory.getCurrentSession();

		try {

			theSession.beginTransaction();
			int theId = 14;

			InstractorDetails theInstractorDetails = theSession.get(InstractorDetails.class, theId);

			System.out.println("=============\n");

			System.out.println("the instructor Detail " + theInstractorDetails);
			System.out.println("==========\n");
			System.out.println(theInstractorDetails.getInstructor());

			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} catch (Exception e) {
			e.printStackTrace();

		}

		finally {
			theSession.close();
			factory.close();

		}

	}

}
