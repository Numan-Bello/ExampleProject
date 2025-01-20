package com.neotech.lesson06;

import java.util.Scanner;

public class Extras1 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name of City: ");
		String city = input.next();
		
		System.out.print("Enter temperature (in Fahrenheit): ");
		int temp = input.nextInt();
		
		System.out.println(city + " - " + ((temp - 32) * 5 / 9) + "°C");
		System.out.println("Mostly cloudy");
		
		input.close();
		
	}
}
