package com.polymorphismdemo1;

public class Mainmethod {
public static void main(String[] args) {
	Payroll p= new Payroll();
	p.adjustSalary();
	Admin a = new Admin();
	a. adminDetails();
	a.doAdimStuff("sree",5454);
	a.doAdimStuff();
	Academic ac =  new Academic();
	ac.adjustSalary();
	ac.giveLecture("mahi",66778);
}
}
