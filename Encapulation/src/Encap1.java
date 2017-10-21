package edu.bcas.Encapsulation;

public class Encap1 {

public static void main(String args[]) {
 EncapTest encap=new EncapTest();	
 
 encap.setName("sajith");
 encap.setAge(20);
 encap.setIdNum("1234ms");
 encap.setAddress("Jaffna");
 
 System.out.println("Name : "+ encap.getName()+"Age : " +encap.getAge()+"address : "+encap.getaddress());
}
}
