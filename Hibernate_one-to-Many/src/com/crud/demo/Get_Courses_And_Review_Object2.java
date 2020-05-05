package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;
import com.Entities.Review;

public class Get_Courses_And_Review_Object2 {

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
			 

			//get the course 
			
			int id = 3;
			
			Course theCourse = theSession.get(Course.class, id);
			
			//print the course
			
			System.out.println(theCourse);
			System.out.println("==========\n");
			// print the course review
			
			System.out.println(theCourse.getReview());
					
			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
