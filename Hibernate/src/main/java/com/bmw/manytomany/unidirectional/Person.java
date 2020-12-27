package com.bmw.manytomany.unidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String name;
	@ManyToMany
	@JoinTable(name="Person_Mobile",joinColumns = {@JoinColumn(name="person_id")},
	inverseJoinColumns = {@JoinColumn(name="mobile_Id")})
	private List<Mobile> mobiles;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	

}
