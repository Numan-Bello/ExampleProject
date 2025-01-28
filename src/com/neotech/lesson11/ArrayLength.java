package com.neotech.lesson11;

public class ArrayLength 
{
	public static void main(String[] args) 
	{
		
		String [] names = new String [5];
		names[0] = "Easter";
		names[1] = "Secil";
		names[2] = "Everest";
		names[3] = "May";
		names[4] = "Delian";
		
		int nameSize = names.length;
		System.out.println(nameSize);
		
	//	int [] scores1, scores2;
		int [] scores = {90, 80, 20, 40};
		System.out.println(scores.length);
		
	}
}
