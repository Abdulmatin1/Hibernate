package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;

public class GitLaziVesEgarLoading {

	public static void main(String[] args) {

		// create SessionFactory

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstractorDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		// create a Session

		Session theSession = factory.getCurrentSession();

		try {

			theSession.beginTransaction();
		 
				int id = 19;
				
				Instructor theInstructor =theSession.get(Instructor.class, id);
				
				System.out.println(" Kayhan Academy get instructor " + theInstructor);
				
				System.out.println("=================\n");
				
				System.out.println(" KAYHAN ACADEMY instructor COurses => " +  theInstructor.getCoures());			
			

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
