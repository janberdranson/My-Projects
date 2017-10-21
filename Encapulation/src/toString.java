package edu.bcas.Encapsulation;

public class toString {

	public static void main(String args[]) {
		vehicle v1 = new vehicle();
		v1.setVehicleNumber("V122345");
		v1.setModelName("Honda");
		v1.setMaufacturingYear("2015");
		v1.setColor("Blue");
		v1.setCapacity("1300");
		v1.setPlace("Jaffna");
		System.out.println(v1.toString( ));
		
	}

}
