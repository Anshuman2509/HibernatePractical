package com.bmw.onetomany.unidirectionaljoincolumn;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee8 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	@OneToMany
	@JoinColumn(name="emp_Id")
	private List<Address8> addresses;
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
	public List<Address8> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address8> addresses) {
		this.addresses = addresses;
	}
	

}
