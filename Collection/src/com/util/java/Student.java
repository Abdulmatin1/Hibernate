package com.util.java;

public class Student {
	
	
	public int id;
	public String name,grade;
	public int age;
	
	public Student(int stid, String stname, String stGrad, int stage) {
		
		id = stid;
		name = stname;
		grade = stGrad;
		age = stage;
		
		
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", age=" + age + "]";
	}
	
	
	
	
	

}
