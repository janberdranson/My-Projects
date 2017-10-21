package edu.bcas.Encapsulation;

public class EncapTest{
	
		private String name;
		private String idNum;
		private int age;
		private String address;
		
public int getAge() {
	return age;	
}
public String getName() {
	return name;	
}
public String getaddress() {
	return address;
}
public String idNUm() {
	return idNum;	
}

public void setAge(int newAge) {
	age=newAge;
	
}
public void setName(String newName) {
	name=newName;

}
public void setIdNum(String newId) {
	idNum=newId;
}
public void setAddress(String newAddress) {
	name=newAddress;
}

}