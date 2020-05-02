package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.Entity.Instructo;
import com.hibernate.Entity.Instructor_Detail;
 

public class CreateObject {

	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructo.class)
				.addAnnotatedClass(Instructor_Detail.class)
				.buildSessionFactory();
		
		Session theSession = factory.getCurrentSession();
		
		try {
			// begining the transaction
			theSession.beginTransaction();
			
			// create object 
			
		 Instructo theInstructo1 = new Instructo("Shabana", "khadim", "khadim@gmail.com");
		 Instructo theInstructo2 = new Instructo("Morad", "ahmad", "morad@gmail.com");
		 Instructo theInstructo3 = new Instructo("Friba", "zahir", "friba@gmail.com");
		 Instructo theInstructo4 = new Instructo("Shapari", "Norani", "norani@gmail.com");
		 
		 Instructor_Detail myInstructor_Detail1 = new Instructor_Detail("Shabana@youtub.com", "Cooking");
		 Instructor_Detail myInstructor_Detail2 = new Instructor_Detail("Morad@youtub.com", "Agriculter");
		 Instructor_Detail myInstructor_Detail3 = new Instructor_Detail("Friba@youtub.com", "IT");
		 Instructor_Detail myInstructor_Detail4 = new Instructor_Detail("Shapari@youtub.com", "Polictic");
		 
		 theInstructo1.setInstructor_detail_id(myInstructor_Detail1);
		 theInstructo2.setInstructor_detail_id(myInstructor_Detail2);
		 theInstructo3.setInstructor_detail_id(myInstructor_Detail3);
		 theInstructo4.setInstructor_detail_id(myInstructor_Detail4);
		 
		 theSession.save(theInstructo1);
		 theSession.save(theInstructo2);
		 theSession.save(theInstructo3);
		 theSession.save(theInstructo4);
		 
		 
		 System.out.println("this object info is coming from toString()" + theInstructo1);
		 System.out.println("this object info is coming from toString()" + theInstructo2);
		 System.out.println("this object info is coming from toString()" + theInstructo3);
		 System.out.println("this object info is coming from toString()" + theInstructo4);
			
			theSession.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
			
		} finally {
			theSession.close();
			
		}

	}

}
