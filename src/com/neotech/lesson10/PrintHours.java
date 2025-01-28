package com.neotech.lesson10;

public class PrintHours 
{
	public static void main(String[] args) 
	{
		
		// Print the whole combination of hours in a digital clock
				
				for (int hour = 0; hour < 24; hour++)
				{
					//System.out.println(hour);
					
					for (int min = 0; min < 60; min++)
					{
						//System.out.println(hour + ":" + min);
						//The above statement has the following issues:
							//1. When hour < 10 and minutes < 10 --> 1:1 --> 01:01
							//2. When hour < 10 and minutes >= 10 --> 1:10 --> 01:10
							//3. When hour >= 10 and minutes < 10 --> 10:1 --> 10:01
							//4. When both hour and minutes >= 10 --> nothing to change
						
						if (hour < 10 && min < 10) 
						{
							System.out.println("0" + hour + ":0" + min);
						}
						else if (hour < 10 && min >= 10)
						{
							System.out.println("0" + hour + ":" + min);
						}
						else if (hour >= 10 && min < 10)
						{
							System.out.println(hour + ":0" + min);
						}
						else 
						{
							System.out.println(hour + ":" + min);
						}
					}
				}
		
	}
}
