package com.training.bank;

public class customer {

	
	
	private int cusId;
	@Override
	public String toString() {
		return "customer [cusId=" + cusId + ", cusName=" + cusName + ", deptName=" + deptName + ", salary=" + salary
				+ "]";
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public customer(int cusId, String cusName, String deptName, double salary) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.deptName = deptName;
		this.salary = salary;
	}
	private String cusName;
	private String deptName;
	private double salary;
	
	
}
