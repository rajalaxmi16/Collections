package com.java.programs;

import java.util.Scanner;

public class Palindrome_Number {

	public static int palindrome(int num)
	{
		int temp=num;
		int rev=0;
		//Use loop for separate number
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		//Check reverse is equal to number
		if(num == rev)
		{
			System.out.println(num+" is a Palindrome number!!");
		}
		else
		{
			System.out.println(num+" is not a Palindrome number!!");
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		palindrome(num);

	}

}
