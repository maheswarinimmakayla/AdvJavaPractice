package com.polymorphismdemo1;

public class Admin extends Payroll{

	String adminName = "mani";
	int adminSalary = 54578;
	public void adminDetails() {
		   System.out.println("Enter adjustDetails  ....."); 
		   System.out.println("adminName =" + adminName); 
		   System.out.println("adminSalary =" + adminSalary); 
	   }
	public void doAdimStuff(String adminName, int adminSalary) {
		this.adminName = adminName;
		this.adminSalary = adminSalary;
		   System.out.println("adminName =" + adminName); 
		   System.out.println("adminSalary =" + adminSalary); 
	   }
	public void doAdimStuff() {
		System.out.println("Adjust salary of admin is 5678");
	}
}
