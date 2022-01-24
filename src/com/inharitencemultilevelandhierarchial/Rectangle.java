package com.inharitencemultilevelandhierarchial;

public class Rectangle extends Circle {
	
double width;
double length;
public void rectangle() {
	   System.out.println("Enter the Rectangle details");
	      System.out.println("Enter  Rectangle width");
			width = sc.nextDouble();
			length = sc.nextDouble();
			double area=length*width;
			System.out.println("Area of rectangle="+area);
			

}

}
