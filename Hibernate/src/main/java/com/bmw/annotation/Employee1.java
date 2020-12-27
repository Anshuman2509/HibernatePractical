package com.bmw.annotation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "emp1")
public class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fName",nullable = false)
	private String firstName;
	@Column(name="lName",nullable = false)
	private String lastName;
	private int age;
	private boolean isPostGraduate;
	private Date dateOfJoining;
	private double salary;
	@Transient
	private String department;
	public Employee1() {
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", isPostGraduate=" + isPostGraduate + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	

}
