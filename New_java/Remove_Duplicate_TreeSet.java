package src.com.New_java;
import java.util.*;

public class Remove_Duplicate_TreeSet {

	public static void main(String[] args) {
	   
		Set<Customer> t1=new TreeSet<>();
		
		Customer c1=new Customer(100,"h");
		Customer c2=new Customer(100,"g");
		
		t1.add(c2);
		t1.add(c1);
		
		for(Customer c:t1)
		{
			System.out.println(c);
		}
	}

}
