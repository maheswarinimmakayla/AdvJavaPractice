package com.polymorphismdemo1;

public class Academic extends Payroll{
	
	String academicName ="mahi";
	int academicSalary = 66778;
	
	public void adjustSalary() {
		   System.out.println("Enter adjustSalary Academic is 23007"); 
	   }
	public void giveLecture(String name,int salary) {
		   System.out.println("Enter acadamicDetails  ....."); 
		   System.out.println("academicName =" + academicName); 
		   System.out.println("academicSalary =" +academicSalary ); 
		   
	   }
}
