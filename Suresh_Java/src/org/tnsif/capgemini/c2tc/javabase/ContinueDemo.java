package org.tnsif.capgemini.c2tc.javabase;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<10;i++)
		{
			if(i==5 || i==7)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}