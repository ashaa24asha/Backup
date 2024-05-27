package com.stl.example;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility 
{
	//Add Student
	public static Student addStudent(List<Student> students)
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Please enter Student Id");
		 s.setsId(sc.nextInt());
		 System.out.println("Please enter Student Name");
		 s.setName(sc.next());
		 System.out.println("Please enter Student Age");
		 s.setAge(sc.nextInt());
		
		return s;
		
	}
	//Display Student
	public static void displayAllStudent(List<Student> students)
	{
		Iterator<Student> studentIterator = students.iterator();
		while(studentIterator.hasNext())
		{
			System.out.println(studentIterator.next());
		}
	}
}
