package com.neotech.lesson05;

public class Task2 
{
	public static void main(String[] args) 
	{

		boolean itsFriday = true;
		int day = 15;
		
		if (itsFriday)
		{
			System.out.println("It's Friday. I am going to watch a movie.");
			if (day == 13)
			{
				System.out.println("I will watch a scary movie.");
			}
			else if (day == 15)
			{
				System.out.println("I will watch a thriller.");
			}
			else
			{
				System.out.println("I will watch a comedy.");
			}
		}
		else
		{
			System.out.println("It's not Friday. I am going to study Java.");
		}
		
	}
}
