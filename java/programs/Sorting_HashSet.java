package com.java.programs;
import java.util.*;

public class Sorting_HashSet {

	public static void main(String[] args) 
	{
		Set<Employee> h1=new HashSet<>();
		
		Employee e1=new Employee(10000.0,"S");
		Employee e2=new Employee(40000.0,"R");
		Employee e3=new Employee(2000.0,"F");
		
		Sort_based_on_Sal s1=new Sort_based_on_Sal();
		
		h1.add(e1);
		h1.add(e2);
		h1.add(e3);
		
	Set<Employee> t1=new TreeSet<>(s1);  //If Comparator is implementing then pass that implemented class Object in TreeSet
	t1.addAll(h1);  //to pass HashSet value in TreeSet		
		
		System.out.println(t1);
	}

}
