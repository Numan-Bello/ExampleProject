package com.neotech.lesson10;

public class Task3 
{
	public static void main(String[] args) 
	{
		

		/*
		 
	    *
	   * *
	  * * *
	 * * * *
	* * * * *
			 
			 */

		for (int i = 0; i < 5; i ++)
		{
			for (int s = 4; s >= i; s --)
			{
				System.out.print(" ");
			}
			for (int str = 0; str <= i; str ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
