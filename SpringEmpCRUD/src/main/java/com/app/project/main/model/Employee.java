package com.app.project.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name = "emp_table", catalog = "emp_database")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private String address;
	private long Phoneno;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String ename, String address, long phoneno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		Phoneno = phoneno;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(long phoneno) {
		Phoneno = phoneno;
	}
	

}

