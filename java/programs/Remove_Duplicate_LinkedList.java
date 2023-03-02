package com.java.programs;

import java.awt.List;
import java.util.LinkedList;

public class Remove_Duplicate_LinkedList {

	public static void main(String[] args) 
	{
		
		Customer1 c1=new Customer1(100,"rajalaxmi");
		Customer1 c2=new Customer1(101,"sahg");
		Customer1 c3=new Customer1(100,"rere");
		LinkedList<Customer1> l1=new LinkedList<>();
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		
		
		for(int i=0; i<l1.size(); i++)
		{
			for(int j=i+1; j<l1.size(); j++)
			{
				if(l1.get(i).equals(l1.get(j)))
				{
					l1.remove(j);
				}
			}
		}
       
		System.out.print(l1+" ");
	}

}
