package com.bmw.onetoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee5 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String department;
	@OneToOne@JoinColumn(name = "Address_Id")
	private Address5 address5;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Address5 getAddress5() {
		return address5;
	}
	public void setAddress5(Address5 address5) {
		this.address5 = address5;
	}
	
	

}
