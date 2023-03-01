package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Children_Details")
public class Children {
	
	@Id
	private int baby_id;
	
	private String baby_firstName;
	
	private String baby_lastName;
	
	private String fatherName;
	
	private String motherName;
	
	private String adress;

	public int getBaby_id() {
		return baby_id;
	}

	public void setBaby_id(int baby_id) {
		this.baby_id = baby_id;
	}

	public String getBaby_firstName() {
		return baby_firstName;
	}

	public void setBaby_firstName(String baby_firstName) {
		this.baby_firstName = baby_firstName;
	}

	public String getBaby_lastName() {
		return baby_lastName;
	}

	public void setBaby_lastName(String baby_lastName) {
		this.baby_lastName = baby_lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Children(int baby_id, String baby_firstName, String baby_lastName, String fatherName, String motherName,
			String adress) {
		super();
		this.baby_id = baby_id;
		this.baby_firstName = baby_firstName;
		this.baby_lastName = baby_lastName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.adress = adress;
	}
	
	public Children()
	{
		
	}


	
	

}
