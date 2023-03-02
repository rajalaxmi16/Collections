package com.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Sort_based_on_Sal implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) 
	{
		return e1.sal.compareTo(e2.sal);
	}
  
}

public class ArrayList_Sorting {

	public static void main(String[] args) 
	{
        List<Employee> a=new ArrayList<>();
		
		Sort_based_on_Sal s1=new Sort_based_on_Sal();
		
		Employee e1=new Employee(10000.0,"Smith");
		Employee e2=new Employee(30000.0,"Rita");
		Employee e3=new Employee(20000.0,"Rayn");
		
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
			Collections.sort(a,s1);
		
		System.out.println(a);

	}

}
