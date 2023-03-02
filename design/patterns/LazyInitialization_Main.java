package com.design.patterns;

public class LazyInitialization_Main {

	public static void main(String[] args) {
		SingleTon1 s1=SingleTon1.getInstance();
		SingleTon1 s2=SingleTon1.getInstance();
		SingleTon1 s3=SingleTon1.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s3));
	}

}
