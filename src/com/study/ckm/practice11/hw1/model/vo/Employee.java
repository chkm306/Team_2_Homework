package com.study.practice11.hw1.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int age, double height, double weight,int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
//	
//	public int getSalary() {
//		return salary;
//	}
//	
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}면적
//
//	public String getDept() {
//		return dept;
//	}
//
//	public void setDept(String dept) {
//		this.dept = dept;
//	}

	public String information() { // 상속받은것도 추가하는방법.,.? super.information
		return super.information() +", " + salary + ", " + dept ;
	}

//	@Override 왜 이거 안되지
//	public String information() {
//		return "salary=" + salary + ", dept=" + dept ;
//	}

	
	
	
	
	
}
