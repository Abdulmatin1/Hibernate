package com.hibernate.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// mapping Entity Class to database table

@Entity
@Table(name = "instructor_detail")
public class Instructor_Detail {

	// create fields and map them to table columns

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "youtube_channel")
	private String youTubeChannel;
	@Column(name = "hobby")
	private String hobby;
	
	@OneToOne(mappedBy = "instructor_detail_id", cascade = CascadeType.ALL)
	private Instructor instructo;

	// create constructors

	public Instructor_Detail() {

	}

	public Instructor_Detail(String youTubeChannel, String hobby) {
		this.youTubeChannel = youTubeChannel;
		this.hobby = hobby;
	}

	// generates getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYouTubeChannel() {
		return youTubeChannel;
	}

	public void setYouTubeChannel(String youTubeChannel) {
		this.youTubeChannel = youTubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Instructor_Detail [id=" + id + ", youTubeChannel=" + youTubeChannel + ", hobby=" + hobby + "]";
	}
	
	// generate toStrin() Method
	
	
	

}
