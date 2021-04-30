package com.niit.javaHibernateday1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
//@Table(name = "student_table")
public class Student {
	@Id
	int id;
	@Transient
	//@Transient
	String name;
	@Column(name = "trimester")
	//@Column(name = "trimester")
	int sem;
	int average;

	public  Student() {}
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

		this.average = average;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+id+"\t"+name+"\t"+sem+"\t"+average;
	}


}