package com.neotech.lesson05;

public class Task1 
{
	public static void main(String[] args) 
	{
		
		int day = 8;
		
		if (day == 1)
		{
			System.out.println("Today is monday and we are working.");
		}
		else if (day == 2)
		{
			System.out.println("Today is tuesday and we are working.");
		}
		else if (day == 3)
		{
			System.out.println("Today is wednesday and we are working.");
		}
		else if (day == 4)
		{
			System.out.println("Today is thursday and we are working.");
		}
		else if (day == 5)
		{
			System.out.println("Today is friday and we are working.");
		}
		else if (day < 8)
		{
			System.out.println("We are on break on weekends.");
		}
		else
		{
			System.out.println("Not a day!");
		}
		
	}
}
