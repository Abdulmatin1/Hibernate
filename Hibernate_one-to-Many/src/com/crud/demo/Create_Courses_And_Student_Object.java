package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;
import com.Entities.Review;
import com.Entities.Student;

public class Create_Courses_And_Student_Object {

	public static void main(String[] args) {

		// create SessionFactory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstractorDetails.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
			.buildSessionFactory();

		// create a Session

		Session theSession = factory.getCurrentSession();

		try {

			theSession.beginTransaction();
			 
				Student theStudent1 = new Student("Hamid", "fatih", "java", "hamid@gmail.com");
				Student theStudent2 = new Student("Farida", "karimi", "HTML", "FRIDA@gmail.com");
			 
				theSession.save(theStudent1);
				theSession.save(theStudent2);
				
				Course theCourse = new Course("DEEP LEARNIGN");
				
				theStudent1.addCouse(theCourse);
				theStudent2.addCouse(theCourse);
				
				theSession.save(theCourse);
			
			
	 
			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
