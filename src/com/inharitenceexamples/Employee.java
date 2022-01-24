package com.inharitenceexamples;

import java.util.Scanner;

public class Employee {
	int EmployeeId;
	String EmployeeName;
	int EmployeeAge;
	String EmployeeDept;
	String Salary = "5000";
	Scanner sc = new Scanner(System.in);
	public void enterEmployeeDetails(){

	System.out.println("please enter employee details..");
	System.out.println("Enter employee Id");
	EmployeeId = sc.nextInt();
	System.out.println("Enter Employee name");
	sc.nextLine();
	EmployeeName = sc.nextLine();
	System.out.println("Enter employee age");

	EmployeeAge = sc.nextInt();
	System.out.println("Enter employee department");
	sc.nextLine();
	EmployeeDept = sc.nextLine();
	}
	public void viewEmployeeDetails(){


	System.out.println("employee Id =" + EmployeeId);

	System.out.println("Enter Employee name=" + EmployeeName);

	System.out.println("Enter employee age = " + EmployeeAge);

	System.out.println("Enter employee department="+EmployeeDept);


	}



	}

