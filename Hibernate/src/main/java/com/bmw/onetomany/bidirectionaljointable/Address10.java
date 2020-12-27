package com.bmw.onetomany.bidirectionaljointable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="addr")
public class Address10 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String city;
	private String state;
	@ManyToOne
	@JoinTable(name="Emp_Addr_Map",joinColumns = {@JoinColumn(name="emp_id")},
	inverseJoinColumns = {@JoinColumn(name="add_id")})
	private Employee10 employee10;
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
	public Employee10 getEmployee10() {
		return employee10;
	}
	public void setEmployee10(Employee10 employee10) {
		this.employee10 = employee10;
	}
	

}
