package src.com.New_java;
import java.util.*;

public class Remove_Duplicate_LinkedList {

	public static void main(String[] args) {
		
		List<Customer> li=new LinkedList<>();
		Customer c1=new Customer(100,"s");
		Customer c2=new Customer(100,"t");
		
		li.add(c1);
		li.add(c2);
		
		for(int i=0; i<li.size(); i++)
		{
			for(int j=i+1; j<li.size(); j++)
			{
				if(li.get(i).equals(li.get(j)))
				{
					li.remove(j);
				}
			}
		}
		System.out.println(li);

	}

}
