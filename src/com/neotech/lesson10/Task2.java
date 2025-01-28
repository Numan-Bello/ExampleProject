package com.neotech.lesson10;

import java.util.Scanner;

public class Task2 
{
	public static void main(String[] args) 
	{
		
//		Get input from the user, then based on that print this structure
//		For ex: input = 5

//		1
//		22
//		333
//		4444
//		55555
//		4444
//		333
//		22
//		1
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter a number to display pattern: ");
		int num = user.nextInt();
		
		System.out.println("----------------------------------");
		
		for (int row = 1; row <= num; row ++)
		{
			for (int col = 0; col < row; col ++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		for (int row = num - 1; row >= 1; row --)
		{
			for (int col = 0; col < row; col ++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		user.close();
		
	}
}
