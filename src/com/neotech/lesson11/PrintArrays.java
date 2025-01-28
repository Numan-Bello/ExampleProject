package com.neotech.lesson11;

public class PrintArrays 
{
	public static void main(String[] args) 
	{
		
		int [] points = {90, 85, 80, 75, 70, 65};
		
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);
		System.out.println(points[5]);
		
		int size = points.length;
		
		for (int i = 0; i < size; i ++)
		{
			System.out.println(points[i] + " ");
		}
		
		int sum = 0;
		
		for (int i = 0; i < size; i ++)
		{
			sum += points[i];
		}
		
		System.out.println("The total point is " + sum);
		System.out.println("The average point is " + sum / size); // integar result
		System.out.println("The average point is " + (double)sum / size); // complete result;
		
	}
}
