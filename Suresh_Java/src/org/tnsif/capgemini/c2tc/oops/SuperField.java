package org.tnsif.capgemini.c2tc.oops;

class Animals
{
	String name="Animal";
}

class Doge extends Animals
{
	String name="Dog";
	
	void display()
	{
		System.out.println("Superclass name : "+ super.name);
		System.out.println("subclass name :  "+ name);
	}
}


public class SuperField {

	public static void main(String[] args) {
		
		Doge dog=new Doge();
		dog.display();
	}

}