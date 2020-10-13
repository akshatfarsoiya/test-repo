package com.zensar.spring.beans;


public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private Address address;
	
	
	
	public Employee() {
		super();
		System.out.println("inside EMP const...");
	}
	
	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", address=" + address + "]";
	}

	
	
	
}