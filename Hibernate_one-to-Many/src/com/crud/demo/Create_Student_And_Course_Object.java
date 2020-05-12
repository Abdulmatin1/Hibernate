package com.crud.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entities.Course;
import com.Entities.InstractorDetails;
import com.Entities.Instructor;
import com.Entities.Review;
import com.Entities.Student;

public class Create_Student_And_Course_Object {

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
			 
		 
					Course theCourse = new Course("AI and Machain learning");
					
					
					theSession.save(theCourse);
					
					System.out.println("============");
			
			Student theStudent1 = new Student("Aman", "ZAMIRI", "JAVA", "AMAN@GAMIL.COM");
			Student theStudent2 = new Student("Friba", "khamosh", "PHP", "FRIBA@GAMIL.COM");
			
			theCourse.addStudent(theStudent1);
			theCourse.addStudent(theStudent2);
			
			theSession.save(theStudent1);
			theSession.save(theStudent2);
			
			
			System.out.println("these are the saved students " + theCourse.getStudent() );
			
			// Commit transaction
			theSession.getTransaction().commit();

			System.out.println("I am done I SAVED THE instructo");

		} finally {
			theSession.close();
		}

	}

}
