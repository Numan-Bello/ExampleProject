package com.neotech.lesson04;

public class TemperatureCheck 
{
	public static void main(String[] args) 
	{
		
		int temp = 16;
		
		if (temp < 32)
		{
			System.out.println("Water will freeze with temperature " + temp + "°");
		}
		else
		{
			System.out.println("Water will Not freeze with temperature " + temp + "°");
		}
		
	}
}
