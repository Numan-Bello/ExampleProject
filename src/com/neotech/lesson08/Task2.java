package com.neotech.lesson08;

public class Task2 
{
	public static void main(String[] args) 
	{
		
		boolean workDay = true;
		int day = 1;
		
		do
		{
			if (day > 0 && day < 6)
			{
				System.out.println("I need a day off.");
			}
			else
			{
				System.out.println("I do not need a day off any more.");
				workDay = !true;
			}
			day ++;
		}
		while (workDay);
		
	}
}
