package com.neotech.javapractice01;

import java.util.Scanner;

public class practice2 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name:");
		String str1 = input.next();
		
		System.out.println("Enter last name:");
		String str2 = input.next();
		
		System.out.println("Enter gender:");
		String str3 = input.next();
		
		if (str3.equalsIgnoreCase("male"))
		{
			System.out.println("Your name is: " + str1 + " " + str2 + " and you're " + str3);
		}
		else if (str3.equalsIgnoreCase("Female"))
		{
			System.out.println("Your name is: " + str1 + " " + str2 + " and you're " + str3);
		}
		else
		{
			System.out.println("Invalid gender!");
		}
		
		input.close();
		
	}

}
