package com.bmw.onetoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addr")
public class Address5 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String city;
	private String state;
	@OneToOne@JoinColumn(name = "Emp_id")
	private Employee5 employee5;
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
	public Employee5 getEmployee5() {
		return employee5;
	}
	public void setEmployee5(Employee5 employee5) {
		this.employee5 = employee5;
	}
	
	

}
