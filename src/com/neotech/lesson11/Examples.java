package com.neotech.lesson11;

import java.util.Scanner;

public class Examples 
{
	public static void main(String[] args) 
	{
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter a number:");
//		int num = scan.nextInt();
//		
//		for (int i = 0; i < num; i ++)
//		{
//			for (int j = 0; j < i; j ++)
//			{
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= 2 * (num - i) - 1; k ++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		scan.close();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the pattern size:");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i ++)
		{
			for (int j = 1; j <= i; j ++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for ( int i = num - 1; i >= 1; i --)
		{
			for (int j = 1; j <= i; j ++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		input.close();
		
	}
}
