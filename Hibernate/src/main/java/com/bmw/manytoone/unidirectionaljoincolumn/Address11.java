package com.bmw.manytoone.unidirectionaljoincolumn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addr")
public class Address11 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String city;
	private String state;
	@ManyToOne
	@JoinColumn(name = "emp_Id")
	private Employee11 employee11;
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Employee11 getEmployee11() {
		return employee11;
	}
	public void setEmployee11(Employee11 employee11) {
		this.employee11 = employee11;
	}
	
	
	

}
