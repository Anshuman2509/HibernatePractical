package com.bmw.onetomany.bidirectionaljointable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="emp")
public class Employee10 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	@OneToMany(mappedBy = "employee10")
	private List<Address10> addresses;
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
	public List<Address10> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address10> addresses) {
		this.addresses = addresses;
	}
	
	

}
