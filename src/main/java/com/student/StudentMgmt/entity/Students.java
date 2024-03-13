package com.student.StudentMgmt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rollno;
	private String name;
	private String city;
	private long phoneNo;
	
	
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
	public Students(long rollno, String name, String city, long phoneNo) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.phoneNo = phoneNo;
	}
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", city=" + city + ", phoneNo=" + phoneNo + "]";
	}
	
	

	
}
