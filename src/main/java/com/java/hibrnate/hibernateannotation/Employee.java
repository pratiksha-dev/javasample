package com.java.hibrnate.hibernateannotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_info")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_addr")
	private String empAddress;
	@Column(name="emp_sal")
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "\n [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + "]";
	}
	public Employee(int empId, String empName, String empAddress, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
