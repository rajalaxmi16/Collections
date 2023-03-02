package com.java.programs;

import java.util.*;

public class ArrayList_Programs {

	public static void main(String[] args) 
	{
		List<Customer1> li=new ArrayList<Customer1>();
		
		Customer1 c1=new Customer1(100,"Rajalaxmi");
		Customer1 c2=new Customer1(101,"Raj");
		Customer1 c3=new Customer1(100,"Rajalaxmi");
		
		li.add(c1);
		li.add(c2);
		li.add(c3);
//		System.out.println(li);
	
		for(int i=0;i<li.size();i++)
		{
			for(int j=i+1;j<li.size();j++)
			{
				if(li.get(i).equals(li.get(j)))
						{
							li.remove(j);
						}
			}
		}
		System.out.println(li);
		
	}

}
