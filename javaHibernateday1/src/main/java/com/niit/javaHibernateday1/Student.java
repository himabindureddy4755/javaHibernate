package com.niit.javaHibernateday1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name = "student")
public class Student {
	@Id
	int id;
	@Transient
	String name;
	@Column(name = "trimester")
	int sem;
	int average;


	public Student(int id, String name, int semester, int average) {
		super();
		this.id = id;
		this.name = name;
		this.sem = semester;
		this.average = average;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSemester() {
		return sem;
	}
	public void setSemester(int semester) {
		this.sem = semester;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}



}