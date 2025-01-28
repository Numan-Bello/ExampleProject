package com.neotech.lesson11;

import java.util.Scanner;

public class Recap 
{
	public static void main(String[] args) 
	{
		
		for (int i = 1; i <= 5; i ++)
		{
			for ( int j = 5; j > i; j --)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of your pattern: ");
		num = scan.nextInt();
		
		for ( int i = 1; i <= num; i ++)
		{
			for ( int j = num; j > i; j --)
			{
				System.out.print(" ");
			}
			for ( int k = 1; k <= i; k ++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}
}
