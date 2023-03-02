package com.java.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class User
{
	Long userId;
	Long count;
	public User(Long userId, Long count) {
		super();
		this.userId = userId;
		this.count = count;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
}
public class Map_Program {
	

	public static void main(String[] args) 
	{
		Map<String,User> m1=new HashMap<>();
		Map<String,User> m2=new HashMap<>();
		
		User u1=new User(12345678l,4325647l);
		User u2=new User(26474636l,5342626l);
		User u3=new User(26474656l,5342326l);
		String str1=(u1.getUserId()+"");
    	String str2=(u2.getUserId()+"");
		String str3=(u3.getUserId()+"");		
		m1.put(str1,u1);
		m1.put(str2,u2);
		
		m2.put(str3,u3);
	  
		HashMap[] m= {(HashMap) m1,(HashMap)m2};
		
		
	}

	public HashMap[] count(HashMap[] arr)
	{
		Map<Long,Long> hm=new HashMap<>();
        
         for(int i=0; i<arr.length; i++)
         {
        	 HashMap m1=arr[i];
        	 Set s1=hm.keySet();
		for(Object s:s1)
		{
			Long userId=Long.parseLong((String) s);
           User u= (User)( m1.get(s));
           if(u!=null)
           {
        	   if(u.getCount()!=null)
        	   {
        		   if(hm.containsKey(userId))
        		   {
        			   hm.put(userId,hm.get(userId)+u.getCount());
        		   }
        		   else
        		   {
        			   hm.put(userId,u.getCount());
        		   }
        	   }
           }
		}
      }
         return arr;
	}
}
