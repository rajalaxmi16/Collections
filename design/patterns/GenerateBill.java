package com.design.patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) throws IOException
	{
		GetPlanFactory factory=new GetPlanFactory();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of plan to generate bill");
//		String planType=br.readLine();
		String planType=sc.nextLine();
		
		System.out.println("Enter number of units for bill to calculate");
		int unit=Integer.parseInt(sc.nextLine());
		
		Plan p=factory.getPlan(planType);
		System.out.println("Bill amount for :"+planType+" "+" units is :"+unit);
		p.getRate();
		p.calculateBill(unit);
	}

}
abstract class Plan
{
	protected double rate;
	abstract void getRate();
	
	//Create one concrete method to calculate bill
	public void calculateBill(int unit)
	{
		System.out.println(unit*rate);
	}
}
class DomesticPlan extends Plan
{
	@Override
	public void getRate()
	{
		rate=3.50;
	}
}
class CommercialPlan extends Plan
{
	@Override
	public void getRate()
	{
		rate=4.50;
	}
}
class InstitutionalPlan extends Plan
{
	@Override
	public void getRate()
	{
		rate=5.50;
	}
}
class GetPlanFactory
{
   //Create getPlan() to get object of class Plan
	public Plan getPlan(String planType)
	{
	   if(planType==null)
	   {
		   return null;
	   }
	   
	   if(planType.equalsIgnoreCase("DomesticPlan"))
	   {
		   return new DomesticPlan();
	   }
	   else if(planType.equalsIgnoreCase("commercialplan"))
	   {
		   return new CommercialPlan();
	   }
	   else if(planType.equalsIgnoreCase("institutionalplan"))
	   {
		   return new InstitutionalPlan();
	   }
	   else
	   {
		   return null;   
	   }
	   
	}
}