package src.com.New_java;

import java.util.TreeSet;

class User2 implements Comparable<User2>
{

	int id;
	String name;
	long sal;

	public User2(int id, String name, long sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(User2 u) {
		if(this.id==u.id)
		{
			return 0;
		}
		else if(this.id>u.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
public class RemoveDuplicateForTreeset {

	
	public static void main(String[] args) {
		TreeSet<User2> t1=new TreeSet<>();
		t1.add(new User2(13,"name1",1000));
		t1.add(new User2(11,"name2",1000));
		t1.add(new User2(11,"name2",3000));
		t1.add(new User2(14,"name3",30001));
		
		 for(User2 u:t1)
		 {
			 System.out.println(u);
			 if(u.sal>3000)
			 {
				 System.out.println("Output with grater salary: "+u);
			 }
			 
		 }
	}

}
