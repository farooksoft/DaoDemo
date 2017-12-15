package com.stackroute.daodemo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")	
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empID;
	private String empName;
	private String empDesig;
	private Timestamp postedDate;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public Timestamp getPostedDate() {
		return postedDate;
	}
	public void setPostedDate() {
		this.postedDate = setCurrentDate();
	}
	
	public Timestamp setCurrentDate() {
			return new Timestamp(System.currentTimeMillis());
	}
}
