package com.java.programs;

import java.util.HashSet;
import java.util.Set;

public class Remove_Element_HashSet {

	public static void main(String[] args) 
	{
		Set<Customer1> s1=new HashSet<>();
		
		Customer1 c1=new Customer1(10,"Rosy");
		Customer1 c2=new Customer1(10,"Mohit");
		Customer1 c3=new Customer1(20,"Najma");
		
		s1.add(c1);
		s1.add(c2);
		s1.add(c3);
		
		for(Customer1 c:s1)
		{
			System.out.println(c);
		}
	}

}
