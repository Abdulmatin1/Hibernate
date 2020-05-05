package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;
import com.Entities.Review;

public class Create_Courses_And_Review_Object {

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
			 
			
			Course theCourse = new Course("Soccer- is the most famouse sport in the world");
		  //add review
					theCourse.add(new Review(" Great sprot!!!"));
					theCourse.add(new Review("Ronaldo is one of the greates of soccer!!"));
					System.out.println("==========Saving course======\n");
					System.out.println(theCourse);
					System.out.println(theCourse.getReview());
					theSession.save(theCourse);
					
			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
