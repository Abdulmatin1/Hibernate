package com.util.java;

import java.util.ArrayList;

public class Students_Details {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Kama", "A", 20);
		Student student2 = new Student(2, "ahmad", "C", 21);
		Student student3 = new Student(3, "Munir", "B", 24);
		Student student4 = new Student(4, "Kazim", "A", 19);
		
		ArrayList<Student> studentsList = new  ArrayList<Student>();
		
		
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		
		for(Student s : studentsList) {
			
			System.out.println( " ID=> " + s.id + " Name=> " + s.name + " Grade " +s.grade+ " Age "  + s.age);
		 
		
		}
		
		
		
	 
		System.out.println(student4);
		
		
		
		
	}

}
