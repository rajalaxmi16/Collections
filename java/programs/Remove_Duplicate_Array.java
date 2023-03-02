package com.java.programs;

import java.util.Scanner;

public class Remove_Duplicate_Array {
	
	

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter length");
	  int length=sc.nextInt();
	  int[] arr=new int[length];
	  
	  System.out.println("Enter elements");
		for(int i=0; i<length; i++)
		{
			arr[i]=sc.nextInt();
		}
	  
	  
	  for(int i=0; i<length; i++)
	  {
		  for(int j=i+1; j<length; j++)
		  {
			 if(arr[i]==arr[j])
			 {
				 for(int k=j; k<length-1; k++)
				 {
					 arr[k]=arr[k+1];
				 }
				 length--;
				 j--;
			 }
		  }
	  }
	  
	  for(int i=0; i<length; i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
//	  System.out.println(n);
//	  
//	  
//	  for(int i=0; i<=res.length; i++)
//	  {
//		  for(int j=i+1; j<res.length; j++)
//		  {
//			  if(res[i]!=res[j])
//			  {
//				  System.out.println(res[i]+" ");
//			  }
//		  }
//	  }
	  

	}

}
