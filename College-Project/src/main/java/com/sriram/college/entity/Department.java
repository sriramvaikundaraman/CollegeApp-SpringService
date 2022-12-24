package com.sriram.college.entity;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department {
	@Id
	private int id;
	private String title;
	private String hod;
	private String image;
	
	public Department() {
	}

	public Department(int id, String title, String hod, String image) {
		super();
		this.id = id;
		this.title = title;
		this.hod = hod;
		this.image = image;
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

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", title=" + title + ", hod=" + hod + ", image=" + image + "]";
	}

}
