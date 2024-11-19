package org.tnsif.capgemini.c2tc.oops;


class Animall
{
	Animall()
	{
		System.out.println("Animal Constructor");
	}
}
class Dog7 extends Animall
{
	Dog7()
	{
		super();
		System.out.println("Dog Constructor");
		
	}
}

public class Super_constructer {

	public static void main(String[] args) {
		Dog7 dog=new Dog7();

	}

}