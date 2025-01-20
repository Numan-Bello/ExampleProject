package com.neotech.lesson09;

import java.util.Scanner;

public class Task2 
{
	public static void main(String[] args) 
	{
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		int num = user.nextInt();
		
		for (int i = 1; i <= 12; i ++)
		{
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		user.close();
		
	}
}
