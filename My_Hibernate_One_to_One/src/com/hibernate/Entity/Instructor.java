package com.hibernate.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//map our Entity class to database table

@Entity
@Table(name = "instructor")
public class Instructor {

	// create fields and map them to table columns

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private Instructor_Detail instructor_detail_id;
	
	// this line allow application to delete course hen an associated instructor is deleted.
	//@OneToMany(mappedBy = "instructor",cascade = CascadeType.ALL)
	// if the instructor is deleted the associated course shoudont be deleted
//	@OneToMany(mappedBy = "instructor",cascade={
//		CascadeType.DETACH,
//		CascadeType.MERGE,
//		CascadeType.PERSIST,
//		CascadeType.REFRESH
//		
//	})
	private List<Course> course;
	
	// generate constructors

	public Instructor() {

	}

	public Instructor(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	
	// generate getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public Instructor_Detail getInstructor_detail_id() {
		return instructor_detail_id;
	}

	public void setInstructor_detail_id(Instructor_Detail instructor_detail_id) {
		this.instructor_detail_id = instructor_detail_id;
	}

	 
	
	
	
	
	
	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	
	public void addallCourses(Course thecourse) {
		
		if(course == null) {
			
			course = new ArrayList<>();
		}
		
		course.add(thecourse);
		
		thecourse.setInstructor(this);
		
	}
	
 

	@Override
	public String toString() {
		return "Instructo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", instructor_detail_id=" + instructor_detail_id + "]";
	}

	public void addallCourses(Class theCourse) {
	 
		
	}

	 
	
	

}
