package com.inharitence;

import java.util.Scanner;

public class Employee {
  int empId;
  String empName;
  int empAge;
  String empDepartment;
  int empSalary;
  Scanner src = new Scanner(System.in);
  
  public void calculateSalary() {
	  System.out.println("Enter the Employee Details");
		System.out.println("Enter the empId ");
		empId = src.nextInt();
		System.out.println("Enter the employee Name");
		src.nextLine();
		empName = src.nextLine();
		System.out.println("Enter the emp age");
		empAge = src.nextInt();
		System.out.println("Enter the department");
		empDepartment = src.next();
		System.out.println("Enter the emp salary ");
		empSalary = src.nextInt();
 }
  
  
}
