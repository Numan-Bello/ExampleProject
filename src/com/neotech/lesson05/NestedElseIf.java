package com.neotech.lesson05;

public class NestedElseIf 
{
	public static void main(String[] args) 
	{
		
		boolean hasDone = !true;
		double score = 77;
		
		if (hasDone)
		{
			if (score >= 90)
			{
				System.out.println("A, Great job!");
			}
			else if (score >= 80)
			{
				System.out.println("B, Well done!");
			}
			else if (score >= 70)
			{
				System.out.println("C, You passed!");
			}
			else
			{
				System.out.println("F, You failed!");
			}
		}
		else
		{
			System.out.println("You did not do the quiz, so you failed!");
		}
		
	}
}
