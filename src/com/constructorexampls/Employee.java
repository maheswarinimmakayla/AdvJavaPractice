package com.constructorexampls;

public class Employee {

	int empId;
	float empSalary;
	
   Employee() {
	// TODO Auto-generated constructor stub
	   System.out.println("default constructor of Employee");
}
   Employee(int empId) {
	      this();
		   System.out.println("int parameterised constructor of Employee");
		   this.empId = empId;
	}
   Employee(float empSalary) {
		  this();
		  System.out.println("String parameterised constructor of Employee");
		  this.empSalary = empSalary;
		  System.out.println("empSalary");
	}
   
}
