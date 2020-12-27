package com.bmw.onetomany.unidirectionaljointable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee7 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	@OneToMany
	@JoinTable(name = "Emp_Addr_Map",joinColumns = {@JoinColumn(name="Emp_Id")},
	inverseJoinColumns = {@JoinColumn(name="Addr_Id")})
	private List<Address7> addresses;
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
	public List<Address7> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address7> addresses) {
		this.addresses = addresses;
	}
	
	

}
