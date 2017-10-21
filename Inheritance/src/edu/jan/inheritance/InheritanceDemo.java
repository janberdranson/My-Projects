package edu.jan.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		School sch = new School();

		System.out.println(sch.getSchoolName());
		System.out.println(sch.getAddress());
		System.out.println(sch.getYear());
		sch.printDetails();
	
	    ClassA cA = new ClassA();
	    cA.printDetails();
	    
	    System.out.println(cA.getStudentsNo());
	    System.out.println(cA.getTeachername());
	    
	}
	
	
}
