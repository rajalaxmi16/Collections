package src.com.New_java;
import java.util.*;

public class Remove_Duplicate_HashSet {

	public static void main(String[] args) {
		
		Set<Customer> h1=new HashSet<>();
		
		Customer c1=new Customer(100,"f");
		Customer c2=new Customer(100,"g");
		
		h1.add(c1);
		h1.add(c2);
		
		for(Customer c:h1)
		{
			System.out.println(c);
		}
		
	}

}
