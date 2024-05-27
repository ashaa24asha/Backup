package com.stl.example;

import java.util.Scanner;

public class StudentDatabase {
	
	private String fname;
	private String lname;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tutionBalance = 0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	public StudentDatabase()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first name:");
		this.fname = in.nextLine();
		
		System.out.println("Enter last name");
		this.lname = in.nextLine();
		
		System.out.println("1: Freshmore \n 2: Sophomore \n 3: Junior \n 4: Senior \n 5: Enter class level");
		this.gradeYear = in.nextInt();
		
		setStudentId();
					
		
	}
	
	public void setStudentId()
	{
		id++;
		this.studentId = gradeYear + " "+id;
	}
	public void enroll()
	{
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the course or else enter Q to quit");
			String course = sc.next();
			if(!course.equals("Q"))
			{
				courses = courses + course;
				tutionBalance = tutionBalance + costOfCourse;
			}
			else
			{
				break;
			}
		}while(1 != 0);
			System.out.println("Enrolled course : "+courses);
	}
	
	public void payTutionFees()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Available tutionBalance is: "+tutionBalance);
		System.out.println("Enter your payment");
		int payment = sc.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment: "+payment);
		
	}
	
	public void viewBalance()
	{
		System.out.println("Your Balance is : " + tutionBalance);
	}
	
	public String showInfo()
	{
		return "id: "+id +"\nName:"+" " + fname + lname + "\n Courses Enrolled:"+courses + "\n Balance: $"+ tutionBalance;
	}

}
