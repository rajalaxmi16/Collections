package com.java.programs;
import java.util.*;

public class Sorting_LinkedList {

	public static void main(String[] args) 
	{
	   List<Employee> li=new LinkedList<>();
	   
	   Sort_based_on_Sal s1=new Sort_based_on_Sal();
	   
	   Employee e1=new Employee(1000.0,"S");
	   Employee e2=new Employee(3000.0,"R");
	   Employee e3=new Employee(2000.0,"S");
	   
	   li.add(e1);
	   li.add(e2);
	   li.add(e3);
	   
	   Collections.sort(li,s1);
	   
	   System.out.println(li);
	}

}
