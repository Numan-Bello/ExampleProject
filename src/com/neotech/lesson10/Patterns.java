package com.neotech.lesson10;

public class Patterns 
{
	public static void main(String[] args) 
	{
		
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */	
		
		for (int i = 1; i <= 5; i++)
		{
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		//However, I want to complete this structure 
		//by adding this to it
		/*
		 
		 ****
		 ***
		 **
		 *
		  
		 */	
		
		/*

		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		  
		 */	
		
		for (int i = 4; i >=1 ; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
