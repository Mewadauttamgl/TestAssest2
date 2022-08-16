package com.java.jpa.employee;

import javax.persistence.*;


@Entity


@Table(name = "employee1")

public class Employee {

	
	@Id

	private int empno;

	private String name;

	private String designation;

	private double salary;

	public Employee(int empno, String name, String designation, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
}
