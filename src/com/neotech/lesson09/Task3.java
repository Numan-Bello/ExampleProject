package com.neotech.lesson09;

public class Task3 
{
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 32; i ++)
		{
			if (i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("--------------------------------------------");
		
		for (int i = 1; i <= 32; i ++)
		{
			if (i % 2 == 1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
	}
}