package com.neotech.lesson08;

import java.util.Scanner;

public class Homework2 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		boolean correct = true;
		
		System.out.print("Enter username here: ");
		String u = input.next();
		
		System.out.print("Enter password here: ");
		String p = input.next();
		
		while (correct)
		{
			if (u.equals("@johndoe_"))
			{
				if (p.equals("cat123"))
				{
					System.out.println("---------------------------------");
					System.out.println("Welcome back! John Doe " + u);
					System.out.println("---------------------------------");
					break;
				}
				else
				{
					System.out.print("Enter password again: ");
					p = input.next();
				}
			}
			else
			{
				System.out.print("Enter username here: ");
				u = input.next();
				System.out.print("Enter password here: ");
				p = input.next();
			}
		}
		
		input.close();
		
	}
}
