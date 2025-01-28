package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to display pattern:");
		int num = input.nextInt();
		
		for (int row = 1; row <= num; row ++)
		{
			for (int col = 1; col <= row; col ++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
		for (int row = num - 1; row >= 1; row --)
		{
			for (int col = 1; col <= row; col ++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		
		input.close();
		
	}
}
