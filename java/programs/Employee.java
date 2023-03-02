package com.java.programs;

public class Employee 
{
   Double sal;
   String name;
   
   @Override
public String toString() 
   {
	return "Employee [sal=" + sal + ", name=" + name + "]";
   }

public Employee(Double sal,String name)
   {
	   this.sal=sal;
	   this.name=name;
   }
   
   public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
}
