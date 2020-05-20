package com.util.java;

import java.util.ArrayList;

public class Students {

	public static void main(String[] args) {
 // create an ArrayList 
		
		ArrayList <String> StudentNames = new ArrayList <String>();
		
		StudentNames.add("kamal");
		StudentNames.add("zami");
		StudentNames.add("khabir");
		StudentNames.add("Zubir");
		
		System.out.println(StudentNames.get(2));
		System.out.println(StudentNames.remove(2));
		System.out.println(StudentNames.get(2));
		System.out.println(StudentNames);
		
		StudentNames.add("Sabir");
		
		System.out.println(StudentNames.get(3));
		
		ArrayList <String> newStudentName = new ArrayList <String>();
		
		newStudentName.add("Friba");
		newStudentName.add("Hamid");
		newStudentName.add("Shekiaba");
		
		StudentNames.addAll(newStudentName);
		
		System.out.println(StudentNames);
		
		StudentNames.removeAll(newStudentName);
		
		System.out.println(StudentNames);
	 
		ArrayList <String> oldStudent = new ArrayList<String>();
		
		oldStudent.add("Nazanin");
		oldStudent.add("Baran");
		oldStudent.add("Farzana");
		
	//	newStudentName.addAll(oldStudent);
		
		newStudentName.addAll(1, oldStudent);
		
		System.out.println(newStudentName);
		
		for(String S : oldStudent) {
			System.out.println(S);
		}
		
		for(int s = 0; s < oldStudent.size(); s++ ) {
			System.out.println(oldStudent.get(s));
		}
		 
		
		
		

	}

}
