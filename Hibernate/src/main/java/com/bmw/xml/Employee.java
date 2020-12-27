package com.bmw.xml;

import java.util.Date;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private boolean isPostGraduate;
	private Date dateOfJoining;
	private double salary;
	public Employee() {
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean getIsPostGraduate() {
		return isPostGraduate;
	}
	public void setIsPostGraduate(boolean isPostGraduate) {
		this.isPostGraduate = isPostGraduate;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		

}
