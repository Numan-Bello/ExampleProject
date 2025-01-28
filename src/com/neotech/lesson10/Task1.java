package com.neotech.lesson10;

public class Task1 
{
	public static void main(String[] args) 
	{
		
//		Print the following pattern using a nested for loop.
//		1
//		22
//		333
//		4444
//		55555
		
		for (int row = 1; row <= 5; row ++)
		{
			for (int col = 0; col < row; col ++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
	}
}
