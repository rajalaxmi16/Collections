package src.com.New_java;

import java.util.Objects;

public class Customer
{
   int sal;
   String name;
   


public int getSal() {
	return sal;
}

public void setSal(int sal) {
	this.sal = sal;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Customer(int sal, String name) {
	 this.sal=sal;
	   this.name=name;
}

@Override
public int hashCode() 
{
//	return sal;
	
	return this.name.hashCode();
	
}

@Override
public String toString() {
	return "Customer [sal=" + sal + ", name=" + name + "]";
}

public boolean equals(Object obj) 
{
//	return this.sal==obj.hashCode();
	Customer c = (Customer) obj;
	return this.name.equals(c.name);
}
//@Override
//public int compareTo(Customer o) {
	
//	if(sal==o.getSal())
//	{
//		return 0;
//	}
//	else if(name.compareTo(o.getName())<0)
//	{
//		return -1;
//	}
//	return 1;
//	return (this.name.compareTo(o.getName()));
//}
   
   
}
