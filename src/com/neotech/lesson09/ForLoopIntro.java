package com.neotech.lesson09;

public class ForLoopIntro 
{
	public static void main(String[] args) 
	{
		
		//printing numbers from 1 to 10
				//start at 1 
				//increment by 1
				//end once you hit 10
		int num = 1;
		
		while (num <= 10)
		{
			System.out.print(num + " ");
			num++;
		}
		
		System.out.println();
		
		int total = 0;
		
		//in the for loop statement we have: initialization, condition and increment
		for(int num2 = 1; num2 <= 10; num2++) //define everything here
		{
			System.out.print(num2 + " ");
			total += num2;
		}
		System.out.println();
		
		System.out.println("The value of num is: " + num); //
		System.out.println("The total is -> " + total);
		
		//num2 is a local variable that only lives inside the for loop. 
		//Java will not recognize num2 outside of the loop
		//System.out.println("The value of num2 is: " + num2); //will give a compiler error
		
	}
}
