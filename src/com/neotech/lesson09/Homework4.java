package com.neotech.lesson09;

import java.util.Scanner;

public class Homework4 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i ++)
		{
			System.out.println("Would you like to apply for a credit card?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("Yes"))
			{
				break;
			}
		}
		
		scan.close();
		
	}
}
