package com.stl.example;

public class Main {
	public static void main(String[] args) {
//		Employee emp1 = new Employee(1,"Abc",26.08,"Bangalore");
//		Employee emp2 = new Employee(2,"Abc",26.08,"Bangalore");
//		emp1.raiseSalary();
//		System.out.println(emp1.salary);
//		System.out.println(emp2.salary);
		
		BankAccount ba = new BankAccount("Alia",100);
		System.out.println(ba.withDraw(5));
		
		Cake cake = new Cake();
		cake.setPrice(50.55);
		
		System.out.println(cake.getFlavour());
		System.out.println(cake.getPrice());
		
		
		BirthdayCake birthdayCake = new BirthdayCake();
		System.out.println(birthdayCake.getFlavour());
		
		
	}
}
