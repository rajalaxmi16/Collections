package com.java.programs;
import java.util.*;

public class Sorting_TreeSet {

	public static void main(String[] args) 
	{
		Set<Employee> t1=new TreeSet<>();
		
		Employee e1=new Employee(29093.0,"Wart");
		Employee e2=new Employee(23865.0,"Smith");
		Employee e3=new Employee(5438.0,"Tiger");
		
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		
		System.out.println(t1);
	}

}
