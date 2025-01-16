package com.neotech.lesson03;

public class Task1 
{
	public static void main(String[] args) 
	{

		System.out.println("---Task a.---");
		
		String name = "Nu'man";
		String lastName = "Bello";
		char grade = 'A'; 
		String city, state;
		city = "Abuja";
		state = "FCT";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		
		System.out.println("\n");
		System.out.println("---Task b.---");
		
		System.out.println("My name is " + name + " and my lastname is " + lastName + "." + " I live in the city of " + city + 
							"," + " state of " + state + "." + " My grade is: " + grade);
		
	}
}
