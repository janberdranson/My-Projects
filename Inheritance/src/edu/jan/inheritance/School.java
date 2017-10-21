package edu.jan.inheritance;

public class School {

	public String getSchoolName() {
		return "St.John's College";
	}

	public String getYear() {
		return "2017";
	}

	public String getAddress() {
		return "Chudikuli,Jaffna";
	}
	
	public void printDetails() {
		System.out.println("**"+ getSchoolName () + getYear () + getAddress ());
	}
}
