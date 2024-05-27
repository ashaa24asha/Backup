package com.stl.example;

public class Employee {
	int age;
	String name;
	double salary;
	String location;
	
	

	public Employee(int age,String name,double salary,String location)
	{
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}
	
	void raiseSalary()
	{
		this.salary = this.salary * 12;
	}

}
