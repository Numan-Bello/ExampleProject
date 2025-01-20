package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 
{
	public static void main(String[] args) 
	{
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("Enter your grade:");
		char grade = user.next().charAt(0);
		
		switch (grade)
		{
		case 'A':
		case 'a':
			System.out.println("A - Excellent!");
			break;
		case 'B':
		case 'b':
			System.out.println("B - Good!");
			break;
		case 'C':
		case 'c':
			System.out.println("C - Average!");
			break;
		case 'D':
		case 'd':
			System.out.println("D - Bad!");
			break;
		case 'E':
		case 'e':
		case 'F':
		case 'f':
			System.out.println("Not acceptable!");
			break;
		default:
			System.out.println("Invalid input!");
		}
		
		user.close();
		
	}
}
