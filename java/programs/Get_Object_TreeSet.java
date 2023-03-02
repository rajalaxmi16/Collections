package com.java.programs;
import java.util.*;


public class Get_Object_TreeSet {

	public static void main(String[] args) 
	{
	 Set<CustomerSal> t1=new TreeSet<>();
	 
	 CustomerSal c1=new CustomerSal(20000.0,"firn");
	 CustomerSal c2=new CustomerSal(543872.0,"RF");
	 CustomerSal c3=new CustomerSal(5432.0,"utr");
	 
	 t1.add(c1);
	 t1.add(c2);
	 t1.add(c3);
	 
	 for(CustomerSal c:t1)
	 {
		if(c.sal>30000.0)
		{
			System.out.print(c+" ");
		}
	 }

	}

}
