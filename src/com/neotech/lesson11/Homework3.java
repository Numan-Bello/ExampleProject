package com.neotech.lesson11;

public class Homework3 
{
	public static void main(String[] args) 
	{
		
		String [] countries = {"Algeria", "Libya", "Nigeria", "Ghana", "Sudan"};
		
		for (int i = 0; i < countries.length; i ++)
		{
			if (countries[i].equals("Algeria"))
			{
				System.out.println(countries[i] + " - Algiers");
			}
			else if (countries[i].equals("Libya"))
			{
				System.out.println(countries[i] + " - Tripoli");
			}
			else if (countries[i].equals("Nigeria"))
			{
				System.out.println(countries[i] + " - FCT Abuja");
			}
			else if (countries[i].equals("Ghana"))
			{
				System.out.println(countries[i] + " - Accra");
			}
			else if (countries[i].equals("Sudan"))
			{
				System.out.println(countries[i] + " - Khartoum");
			}
			else
			{
				System.out.println("Invalid!");
			}
		}
		
		System.out.println("--------------------");
		
		for (String country : countries)
		{
			if (country.equals("Algeria"))
			{
				System.out.println(country + " - Algiers");
			}
			else if (country.equals("Libya"))
			{
				System.out.println(country + " - Tripoli");
			}
			else if (country.equals("Nigeria"))
			{
				System.out.println(country + " - FCT Abuja");
			}
			else if (country.equals("Ghana"))
			{
				System.out.println(country + " - Accra");
			}
			else if (country.equals("Sudan"))
			{
				System.out.println(country + " - Khartoum");
			}
			else
			{
				System.out.println("Invalid!");
			}
		}
		
	}
}
