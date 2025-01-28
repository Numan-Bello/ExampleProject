package com.neotech.lesson11;

public class Homework2 
{
	public static void main(String[] args) 
	{
		
		int sum = 0;
		
		int [] random = {2, 45, 22, 45, 33, 2, 65, 7};
		
		int size = random.length;
		
		for (int i = 0; i < size; i ++)
		{
			sum += random[i];
		}
		
		System.out.println("Sum of random is -> " + sum);
		
	}
}
