package com.java.programs;

import java.util.Scanner;

public class Reverse_String_StringBuffer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		//Create instance of StringBuffer
//		StringBuffer s1=new StringBuffer();
		
		//Create instance of String Builder
		StringBuilder s1=new StringBuilder();
		
		//use loop for reverse String
		for(int i=str.length()-1; i>=0; i--)
		{
			s1.append(str.charAt(i));
		}
		
		System.out.print(s1);
	}

}
