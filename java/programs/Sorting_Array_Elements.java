package com.java.programs;

import java.util.Scanner;

public class Sorting_Array_Elements {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		//For entering length
		int length=sc.nextInt();	
		int []arr=new int [length];		
		System.out.println("Enter elements");
		//Use for loop to enter array elements
		for(int i=0; i<length; i++)
		{
			arr[i]=sc.nextInt();
		}		
		//Outer for loop for iteration till length
		for(int i=0; i<length; i++)
		{
			//Inner for loop for checking the no is greater or not
			for(int j=i+1; j<length; j++)
			{
				//Check the no is greater 
//				if(arr[i]>arr[j])  //sorting ascending order
				if(arr[i]<arr[j])  //sorting descending order
				{
					//If greater element found then swap those number
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//Use another loop to print arr
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
