package com.example.StudentExample.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="StudentEntity")
public class StudentEntity {
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public StudentEntity(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public StudentEntity() {
		
	}

}
