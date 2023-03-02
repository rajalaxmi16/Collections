package com.design.patterns;

import java.io.Serializable;

public class Singleton2 implements Serializable{

	private static Singleton2 instance;
	protected Object readResolve()
	{
		return instance;
	}
	
}
