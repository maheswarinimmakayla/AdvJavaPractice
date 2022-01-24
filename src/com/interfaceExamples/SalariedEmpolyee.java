package com.interfaceExamples;

public class SalariedEmpolyee extends Empolyee {
	private double weeklySalary;
	
	public SalariedEmpolyee( String first, String last, String ssn,
			      double salary ) {
		super( first, last, ssn ); 
        setWeeklySalary( salary );
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double getPaymentAmount()
	 {
	      return getWeeklySalary();
      }

}
