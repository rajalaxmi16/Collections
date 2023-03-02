package com.java.programs;
import java.util.*;

public class Get_Object_HashSet {

	public static void main(String[] args)
	{
		Set<CustomerSal> h1=new HashSet<>();
		
		CustomerSal c1=new CustomerSal(399094.0,"with");
		CustomerSal c2=new CustomerSal(543872.0,"RF");
		CustomerSal c3=new CustomerSal(5438.0,"Roi");
		CustomerSal c4=new CustomerSal(43872.0,"Toy");
		
		h1.add(c1);
		h1.add(c2);
		h1.add(c3);
		h1.add(c4);
		
		for(CustomerSal c:h1)
		{
			if(c.sal>=30000.0)
			{
				System.out.print(c+" ");
			}
		}
	}

}
