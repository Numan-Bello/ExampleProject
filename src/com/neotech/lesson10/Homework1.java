package com.neotech.lesson10;

import java.util.Scanner;

public class Homework1 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to reveal pattern: ");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i ++)
		{
			for (int s = 0; s < i; s ++)
			{
				System.out.print(" ");
			}
			for (int str = 1; str <= 2 * (num - i) - 1; str ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
		
	}
}
