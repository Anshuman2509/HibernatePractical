package com.bmw.embeddable2;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee3 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empName;
	@Embedded
	private Address3 address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address3 getAddress() {
		return address;
	}
	public void setAddress(Address3 address) {
		this.address = address;
	}
	

}
