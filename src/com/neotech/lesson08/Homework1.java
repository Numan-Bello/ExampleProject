package com.neotech.lesson08;

public class Homework1 
{
	public static void main(String[] args) 
	{
		
		int even = 0;
		
		while (even <= 10)
		{
			if (even % 2 == 0)
			{
				System.out.print(even + " ");
			}
			even ++;
		}
		
		System.out.println("\n----------------");
		
		int i = 0;
		int sum = 0;
		
		while (i <= 10)
		{
			if (i % 2 == 0)
			{
				sum += i;
			}
			i ++;
		}
		System.out.println("Sum is -> " + sum);	
		
		int num = 0;
		int total = 0;
		
		while (num <= 10)
		{
			total += num;
			num += 2;
		}
		System.out.println("Total is -> " + total);
		
	}
}
