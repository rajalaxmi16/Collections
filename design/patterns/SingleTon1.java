package com.design.patterns;

public class SingleTon1 {
   //By creating a pattern of lazyinitialization we will provide global point to access from anywhere of class
	private static SingleTon1 instance;
	
	private SingleTon1()
	{
		System.out.println("hello i am SingleTon1 class constructor");
	}
	 //But at some point race condition problem may be occured
	synchronized   public static SingleTon1 getInstance()                                                      
	{
		if(instance==null)
		{
//			synchronized(SingleTon1.class) //By creating synchronized block we can avoid race condition
//		      {
			     instance=new SingleTon1();
//		      }
		}
		return instance;
	}
}
