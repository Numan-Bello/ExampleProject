package com.neotech.lesson05;

public class Homework1 
{
	public static void main(String[] args) 
	{
		
		boolean allergic = !true;
		int allergy = 4;
		String one = "Lactose";
		String two = "Peanut";
		String three = "Honey";
		String four = "Seafood";
		String con = "allergy";
		
		if (allergic)
		{
			System.out.println("You are not healthy.");
			if (allergy == 1)
			{
				System.out.println("You have: " + one + " " + con + "." + " Don't eat dairy products.");
			}
			else if (allergy == 2)
			{
				System.out.println("You have: " + one + " and " + two + " " + con + "." + " Don't eat dairy products, and peanut.");
			}
			else if (allergy == 3)
			{
				System.out.println("You have: " + one + ", " + two + "," + " and " + three + " " + con + "." + 
									" Don't eat dairy products, peanut, and honey.");
			}
			else if (allergy == 4)
			{
				System.out.println("You have: " + one + ", " + two + ", " + three + "," + " and " + four + " " + con + "." + 
									" Don't eat dairy products, peanut, honey, and seafood.");
			}
		}
		else
		{
			System.out.println("You are healthy!");
		}
		
	}
}
