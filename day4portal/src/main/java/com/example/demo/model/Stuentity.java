package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentstable")
public class Stuentity {
	@Id
	private int id;
	private String sname;
	private String dname;
	private String mailid;
	public Stuentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stuentity(int id, String sname, String dname, String mailid) {
		super();
		this.id = id;
		this.sname = sname;
		this.dname = dname;
		this.mailid = mailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	

}
