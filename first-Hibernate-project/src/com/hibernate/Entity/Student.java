package com.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// mapping our Entity class to our database table

@Entity
@Table(name="student")
public class Student {
	
	// defining fields and map them to database table columns
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_Name")
	private String FirtsName;
	
	@Column(name="last_Name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	
	// create constructors 
	
	public Student() {
	 
	}

	public Student(String firtsName, String lastName, String email) {
		
		FirtsName = firtsName;
		this.lastName = lastName;
		this.email = email;
	}

	
	// generate getters and setters of our 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return FirtsName;
	}

	public void setFirtsName(String firtsName) {
		FirtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", FirtsName=" + FirtsName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	// generate toString() method
	
	
	
	



}
