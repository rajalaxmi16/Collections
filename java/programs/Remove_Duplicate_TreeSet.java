package com.java.programs;

import java.util.Set;
import java.util.TreeSet;

public class Remove_Duplicate_TreeSet {

	public static void main(String[] args) 
	{
		Set<Customer1> s1=new TreeSet<>();
		
		Customer1 c1=new Customer1(100,"abc");
		Customer1 c2=new Customer1(101,"bfr");
		Customer1 c3=new Customer1(100,"Cde");
		
		s1.add(c1);
		s1.add(c2);
		s1.add(c3);
		
		for(Customer1 c:s1)
		{
			System.out.println(c);
		}
	}

}
