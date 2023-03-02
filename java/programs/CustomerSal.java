package com.java.programs;

public class CustomerSal implements Comparable<CustomerSal>
{
	Double sal;
	   String name;
	   
	public CustomerSal(Double sal,String name)
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
	@Override
	public String toString() {
		return "CustomerSal [sal=" + sal + ", name=" + name + "]";
	}
	@Override
	public int compareTo(CustomerSal c) {
			// TODO Auto-generated method stub
		return this.sal.compareTo(c.sal);
	}

}
