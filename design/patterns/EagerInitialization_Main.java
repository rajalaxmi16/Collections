package com.design.patterns;

public class EagerInitialization_Main {

	public static void main(String[] args) {
		SingleTon s1=SingleTon.getInstance();
		SingleTon s2=SingleTon.getInstance();
		
		System.out.println("hashcode of s1 :"+s1.hashCode()+" hashcode of s2 :"+s2.hashCode());
		System.out.println(s1.equals(s2));
	}

}
