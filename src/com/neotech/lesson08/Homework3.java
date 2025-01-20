package com.neotech.lesson08;

import java.util.Scanner;

public class Homework3 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a score (from 0 - 100):");
		int var = scan.nextInt();
		
		boolean wtnRng = true;
		
		while (wtnRng)
		{
			if (var >= 0 && var < 101)
			{
				System.out.println(var);
				break;
			}
			else
			{
				System.out.println("Invalid score, please enter score again:");
				var = scan.nextInt();
			}
		}
		
		scan.close();
		
	}
}
