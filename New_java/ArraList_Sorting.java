package src.com.New_java;

import java.util.*;

class Employee 
{
	Double sal;
	String name;
	
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

	
	public Employee(Double sal,String name)
	{
		this.name=name;
		this.sal=sal;
	}

	@Override
	public String toString() 
	{
		return "Employee [sal=" + sal + ", name=" + name + "]";
	}
   
		
}
class Sorting implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.sal.compareTo(o2.sal);
	}
}

public class ArraList_Sorting {

	public static void main(String[] args) 
	{
      List<Employee> l1=new ArrayList<>();	
      
       Sorting s=new Sorting();
      
      Employee e1=new Employee(1000.0,"S");
      Employee e2=new Employee(3000.0,"R");
      Employee e3=new Employee(2000.0,"T");
      
      l1.add(e1);
      l1.add(e2);
      l1.add(e3);
      
      Collections.sort(l1,s );
      System.out.print(l1);
	}

}
