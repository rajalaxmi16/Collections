package com.java.programs;
import java.util.*;

public class Get_Object_LinkedList {

	public static void main(String[] args) 
	{
		List<CustomerSal> li=new LinkedList<>();
		
		CustomerSal c1=new CustomerSal(24355.0,"W");
		CustomerSal c2=new CustomerSal(543872.0,"RF");
		CustomerSal c3=new CustomerSal(543872.0,"RF");
	    CustomerSal c4=new CustomerSal(765480.0,"DES");
	    
	    li.add(c1);
	    li.add(c2);
	    li.add(c3);
	    li.add(c4);
	    
		for(CustomerSal c:li)
		{
			if(c.sal>=30000.0)
			{
				System.out.print(c+" ");
			}
		}
	}

}
