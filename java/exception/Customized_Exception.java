package com.java.exception;

public class Customized_Exception extends Exception{
	public static void test(double bal) throws Customized_Exception
	{
		if(bal>0)
		{
			System.out.println(bal);
		}
		else
		{
			throw new Customized_Exception();
		}
	}
	public static void main(String[] args) {
		double bal=0.0;
		System.out.println(bal);
	}

}
