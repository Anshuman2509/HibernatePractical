package com.bmw.manytomany.bidirectional;

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
@Table(name = "mobile")
public class Mobile {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mId;
	private String name;
	@ManyToMany
	@JoinTable(name="Person_Mobile",joinColumns = {@JoinColumn(name="person_Id")},
	inverseJoinColumns = {@JoinColumn(name="mobile_id")})
	private List<Person> persons;

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	

}
