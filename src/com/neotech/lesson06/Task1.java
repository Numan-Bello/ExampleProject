package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 
{
	public static void main(String[] args) 
	{
		
		//	Write a program that asks the user to enter first name and 
		//	then last name. At the end, the system should display the user's full name.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your First Name: ");
		String firstName = scan.next();
		
		System.out.print("Enter your Last Name: ");
		String lastName = scan.next();
		
		System.out.print(firstName + " " + lastName);
		
		scan.close();
		
	}
}
