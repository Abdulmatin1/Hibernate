package com.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Review> review;
	
	@ManyToMany(fetch = FetchType.LAZY, 
			cascade = {
					CascadeType.DETACH,
					CascadeType.PERSIST,
					CascadeType.REFRESH,
					CascadeType.MERGE})
	
	
	@JoinTable(name="course_student", 
			joinColumns = @JoinColumn(name="course_id"), inverseJoinColumns = @JoinColumn(name="student_id") )
	public List<Student> student;

	public Course() {

	}

	public Course(String title) {

		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}

	public void add(Review theReview) {

		if (review == null) {

			review = new ArrayList<>();
		}

		review.add(theReview);
	}
 
		
 

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public void addStudent(Student theStudent) {
		
		if(student == null) {
			
			
			student = new ArrayList<>();
		}
		student.add(theStudent);
		
	}
	
	
	@Override
	public String toString() {
		return "course [id=" + id + ", title=" + title + ", instructor=" + instructor + "]";
	}

}
