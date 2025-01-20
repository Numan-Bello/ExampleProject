package com.neotech.lesson06;

import java.util.Scanner;

public class Homework2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What day is today?");
		int day = scan.nextInt();
		
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
		{
			System.out.println("It is a weekday.");
		}
		else if (day > 5 && day < 8)
		{
			System.out.println("It is a weekend.");
		}
		else
		{
			System.out.println("Invalid input!");
		}
		
		scan.close();
		
	}
}
