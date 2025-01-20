package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample 
{
	public static void main(String[] args) 
	{
		
		// Ask a user to guess the number
		// The lucky number is 5
		
		int luckyNumber = 5;
		int userGuess;
		
		Scanner scan = new Scanner(System.in);
		
		//using while loop 
	/*	
		//I must ask first the user to try and guess the number
		System.out.println("Guess my lucky number: ");
		userGuess = scan.nextInt();
		
		//this loop needs to run until the user guesses the number
		while(userGuess != luckyNumber)
		{
			System.out.println("No, try again: ");
			userGuess = scan.nextInt();
		}
		
		System.out.println("You got it!");
		
		*/
		
		
		//using do while
		
		do 
		{
			System.out.println("Guess the lucky number: ");
			userGuess = scan.nextInt();
			
		}while(userGuess != luckyNumber);
		
		System.out.println("You got it!");
		
		scan.close();
		
	}
}
