package com.bmw.onetomany.bidirectionaljoincolumnmappedby;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addr")
public class Address9 {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String city;
	private String state;
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee9 employee9;
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
	public Employee9 getEmployee9() {
		return employee9;
	}
	public void setEmployee9(Employee9 employee9) {
		this.employee9 = employee9;
	}
	
	

}
