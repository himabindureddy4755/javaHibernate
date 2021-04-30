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
	//@Transient
	StudentName name;
	//@Column(name = "trimester")
	int sem;
	int average;
	
	public  Student() {}

	public Student(int id, int sem, int average,StudentName sname) {
		super();
		this.id = id;
		this.sem = sem;
		this.average = average;
		this.name = sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getSem() {
		return sem;
	}
	public void setSemester(int sem) {
		this.sem = sem;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"+id+"\t"+name+"\t"+sem+"\t"+average;
	}
	

}