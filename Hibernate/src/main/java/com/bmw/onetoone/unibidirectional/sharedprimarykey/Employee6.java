package com.bmw.onetoone.unibidirectional.sharedprimarykey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee6 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	@OneToOne
	@PrimaryKeyJoinColumn
	private Address6 address6;
	private String department;
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
	public Address6 getAddress6() {
		return address6;
	}
	public void setAddress6(Address6 address6) {
		this.address6 = address6;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
