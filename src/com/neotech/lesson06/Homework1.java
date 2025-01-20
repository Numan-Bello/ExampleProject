package com.neotech.lesson06;

import java.util.Scanner;

public class Homework1 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your height (in inches):");
		int height = input.nextInt();
		
		String shorrt = "Short";
		String medium = "Medium";
		String tall = "Tall";
		
		if (height < 60 && height >= 30)
		{
			System.out.println("You measure as: " + shorrt);
		}
		else if (height > 60 && height <= 72)
		{
			System.out.println("You measure as: " + medium);
		}
		else if (height > 72 && height <300)
		{
			System.out.println("You measure as: " + tall);
		}
		else
		{
			System.out.println("Invalid input!");
		}
		
		input.close();
		
	}
}
