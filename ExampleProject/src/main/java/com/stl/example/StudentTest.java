package com.stl.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number of student you want to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		StudentDatabase[] students = new StudentDatabase[numOfStudents];
		for(int n = 0; n < numOfStudents; n++)
		{
			students[n] = new StudentDatabase();
			students[n].enroll();
			students[n].payTutionFees();
			System.out.println(students[n].showInfo());
		}
		
		
//		for(int n = 0;n < numOfStudents; n++)
//		{
//			System.out.println(students[n].showInfo());
//		}
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		List<Student> studentList = new ArrayList<Student>();
//		while(true)
//		{
//			System.out.println("Student Management");
//			System.out.println(""
//					+ "1: Add Student\n"
//					+ "2: Update Student\n"
//					+ "3: Display Students\n"
//					+ "4: Delete Student\n"
//					+ "5: Exit\n");
//			System.out.println("Please select the option");
//			int option = sc.nextInt();
//			switch(option)
//			{
//			case 1: 
//				Student stud = StudentUtility.addStudent(studentList);
//				studentList.add(stud);
//				System.out.println("Student Added Successfully");
//				break;
//			case 2:
//				break;
//			case 5:
//				System.exit(0);
//				break;
//				default:
//					System.err.print("Please enter the correct option");
//			}
//		}
				
	}
}
