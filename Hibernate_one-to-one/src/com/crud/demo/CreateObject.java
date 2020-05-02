package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class CreateObject {

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
 
			Instructor  theInstructor1 = new Instructor("Sana", "Walizada", "sana@gmail.com");
			Instructor  theInstructor2 = new Instructor("kayhan", "Walizada", "kayhan@gmail.com");
			Instructor  theInstructor3 = new Instructor("Haroon", "Walizada", "Haroon@gmail.com");
			Instructor  theInstructor4 = new Instructor("Rabany", "Walizada", "Rabany@gmail.com");
			
			InstractorDetails theInstractorDetails1 = new InstractorDetails("sana zainab", "Kids cartoon");
			InstractorDetails theInstractorDetails2 = new InstractorDetails("Kayhan", "baby healths");
			InstractorDetails theInstractorDetails3 = new InstractorDetails("Hroon", "Tofeal");
			InstractorDetails theInstractorDetails4 = new InstractorDetails("Rabany", "Engineering");
			
			theInstructor1.setInstructor_Detail(theInstractorDetails1);
			theInstructor2.setInstructor_Detail(theInstractorDetails2);
			theInstructor3.setInstructor_Detail(theInstractorDetails3);
			theInstructor4.setInstructor_Detail(theInstractorDetails4);
			// Save the object

			theSession.save(theInstructor1);
			theSession.save(theInstructor2);
			theSession.save(theInstructor3);
			theSession.save(theInstructor4);
			
			
			System.out.println("instractor inforamtion " + theInstructor1);
			System.out.println("instractor inforamtion " + theInstructor2);
			System.out.println("instractor inforamtion " + theInstructor3);
			System.out.println("instractor inforamtion " + theInstructor4);
			System.out.println("instractor detail information " + theInstractorDetails1);
			System.out.println("instractor detail information " + theInstractorDetails2);
			System.out.println("instractor detail information " + theInstractorDetails3);
			System.out.println("instractor detail information " + theInstractorDetails4);
			

			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
