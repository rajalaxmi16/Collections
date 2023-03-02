package com.java.programs;
import java.util.*;

public class Get_Object_ArrayList {

	public static void main(String[] args) 
	{
		List<CustomerSal> l1=new ArrayList<>();
		
		CustomerSal c1=new CustomerSal(40000.0,"Ward");
		CustomerSal c2=new CustomerSal(30000.0,"Smith");
		CustomerSal c3=new CustomerSal(50000.0,"Devid");
		CustomerSal c4=new CustomerSal(1000.0,"Rehan");
		
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		l1.add(c4);
		
		for(CustomerSal c:l1)
		{
			if(c.sal>=30000.0)
			{
				System.out.print(c+" ");
			}
		}
	}

}
