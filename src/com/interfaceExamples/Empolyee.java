package com.interfaceExamples;

public abstract class Empolyee implements Payable {
	private String firstName;
    private String lastName;
	 private String socialSecurityNumber;
	 public Empolyee( String first, String last, String ssn ){
	        firstName = first;
	        lastName = last;
	        socialSecurityNumber = ssn;
	     }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	

}
