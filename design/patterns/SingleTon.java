package com.design.patterns;

public class SingleTon {

	//By initializing globally we can not handle exceptions
  // private static final SingleTon instance=new SingleTon();
	
	//By initializing inside static block we can handle exceptions
	private static SingleTon instance=null;
	static
	{
		try
		{
			if(instance==null)
			{
				instance=new SingleTon();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private SingleTon()
	{
		System.out.println("Hello i am SingleTon class constructor");
	}
	public static SingleTon getInstance()
	{
		return instance;
	}
}
