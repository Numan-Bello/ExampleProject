package com.neotech.lesson09;

import java.util.Scanner;

public class Homework2 
{
	public static void main(String[] args) 
	{
		
		boolean correct = true;
		String userName, password;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter username here:");
		userName = input.next();
		System.out.println("Enter password here:");
		password = input.next();
		
		while (correct)
		{
			if (userName.equals("@_janedoe77"))
			{
				if (password.equals("cat123"))
				{
					System.out.println("-----------------------------------");
					System.out.println("Welcome back! Jane Doe " + userName);
					System.out.println("-----------------------------------");
					break;
				}
				else
				{
					System.out.println("Wrong password! Enter again: ");
					password = input.next();
				}
			}
			else
			{
				System.out.println("Enter username here:");
				userName = input.next();
				System.out.println("Enter password here:");
				password = input.next();	
			}
		}
		
		input.close();
		
	}
}
