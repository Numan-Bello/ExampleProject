package com.neotech.lesson11;

public class IntroToArrays 
{
	public static void main(String[] args) 
	{
		
		int [] array1 = new int [5];
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		array1[0] = 5;
		array1[1] = 10;
		array1[2] = 20;
		array1[3] = 25;
		array1[4] = 30;
		
		System.out.println("--- After elements assignment ---");
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		int [] array2;
		array2 = new int [3];
		array2[2] = 8;
		array2[1] = 4;
		array2[0] = array2[2] + array2[1];
		
		System.out.println("array2[0] --> " + array2[0]);
		
		String strArray [] = new String [2];
		strArray[0] = "Richmond";
		strArray[1] = "Istanbul";
		strArray[0] = "New York";
		
		char [] letters = new char [6];
		letters [0] = 'A';
		letters [1] = 'B';
		letters [2] = 'C';
		letters [3] = 'D';
		letters [4] = 'E';
		letters [5] = 'F';
		
		System.out.println("The letter of index 5 is " + letters[5]);
	
	}
}
