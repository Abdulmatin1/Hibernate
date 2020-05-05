package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Entity.Course;
import com.hibernate.Entity.Instructor;
import com.hibernate.Entity.Instructor_Detail;
 

public class Create_Instructor_and_Courses_Objects {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_Detail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session theSession = factory.getCurrentSession();
		
		try {
			// begining the transaction
			theSession.beginTransaction();
			
			Instructor myInstructor = new Instructor("Mir", "ROMAN", "Roman@gmail.com");
			
			theSession.save(myInstructor);
			
			Course theCourse1 = new Course("SOFTWARE Testing");
			Course theCourse2 = new Course("SOFTWARE DESGIN AND DEVE");
			Course theCourse3 = new Course("SOFTWARE ENGINEERING AND ARCTECETUR");
			
			myInstructor.addallCourses(theCourse1);
			myInstructor.addallCourses(theCourse2);
			myInstructor.addallCourses(theCourse3);
			
			theSession.save(theCourse1);
			theSession.save(theCourse2);
			theSession.save(theCourse3);
			
			System.out.println("===================\n");
		 
		System.out.println(myInstructor);
		
		System.out.println("===================\n");
		System.out.println(theCourse1);
		System.out.println(theCourse2);
		System.out.println(theCourse3);
			
			theSession.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
			
		} finally {
			theSession.close();
			
		}

	}

}
