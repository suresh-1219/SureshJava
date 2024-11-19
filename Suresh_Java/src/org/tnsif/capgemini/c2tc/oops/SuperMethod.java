package org.tnsif.capgemini.c2tc.oops;

class Animalls
{
	void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}
class Dogs extends Animalls
{
	void makeSound()
	{
		super.makeSound();
		System.out.println("Dog Barks");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
	  Dogs dog=new Dogs();
	  dog.makeSound();
	 
			  
	}

}
