package com.bmw.onetomany.bidirectionaljoincolumnmappedby;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "emp")
public class Employee9 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	//mappedby name should be exact as the Employee9 property name in Address class
	@OneToMany(mappedBy = "employee9")
	private List<Address9> address;
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
	public List<Address9> getAddress() {
		return address;
	}
	public void setAddress(List<Address9> address) {
		this.address = address;
	}
	
	

}
