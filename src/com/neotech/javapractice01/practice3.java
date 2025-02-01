package com.neotech.javapractice01;

import java.util.Scanner;

public class practice3 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String username = scan.next();
		
		if (username.equals("@lewis44"))
		{
			System.out.println("Enter password:");
			String password = scan.next();
			
			if (password.equals("lewis@123"))
			{
				System.out.println("----------------------------------");
				System.out.println("Welcome back! " + username);
				System.out.println("Lewis Hamilton 44 - Ferrari");
				System.out.println("----------------------------------");
			}
			else
			{
				System.out.println("Wrong password!");
				System.out.println("Enter password again:");
				password = scan.next();
			}
		}
		else
		{
			System.out.println("Wrong credentials!");
		}
		
		scan.close();
		
	}

}
