package com.stl.example;

public class Student {
	private int sId;
	private String name;
	private int age;
	
	public Student() {
		super();
		
	}
	
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int sId, String name, int age) {
		super();
		this.sId = sId;
		this.name = name;
		this.age = age;
	}
	
	

}
