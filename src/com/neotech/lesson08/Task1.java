package com.neotech.lesson08;

public class Task1 
{
	public static void main(String[] args)
	{
		
		//How can I print only even numbers from 50 to 1?
		
		int i = 50;
		
		while (i > 1)
		{
			System.out.print(i + " ");
			i = i - 2;
		}
		
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------");
		
		int num = 50;
		
		while (num > 1)
		{
			if (num % 2 == 0)
			{
				System.out.print(num + " ");
			}
			num --;
		}
		
	}
}
