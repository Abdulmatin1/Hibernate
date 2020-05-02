package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.Entity.Instructo;
import com.hibernate.Entity.Instructor_Detail;
 

public class DeleteInstructorObject {

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
			
			int theid = 3;
			
			Instructo theInstructo = theSession.get(Instructo.class, theid);
			
			if(theInstructo != null) {
				
				theSession.delete(theInstructo);
				
				System.out.println("this instructo is deleted"  + theInstructo);
			}
		
			
			theSession.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
			
		} finally {
			theSession.close();
			
		}

	}

}
