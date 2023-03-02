package com.design.patterns;

import java.util.Scanner;

abstract class Computer
{
	abstract public String getRAM();
	abstract public String getHDD();
	abstract public String getCPU();
	
	 @Override
	    public String toString()
	    {
	    	return "RAM="+this.getRAM()+",HDD="+this.getHDD()+",CPU="+this.getCPU();
	    }
}
class PC extends Computer
{
    private String ram;
    private String hdd;
    private String cpu;
    public PC(String ram,String hdd,String cpu)
    {
    	this.ram=ram;
    	this.hdd=hdd;
    	this.cpu=cpu;
    }
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}
	@Override
	public String getCPU() {	
			return this.cpu;
	}
}
class Server extends Computer
{
	 private String ram;
	    private String hdd;
	    private String cpu;
	    public Server(String ram,String hdd,String cpu)
	    {
	    	this.ram=ram;
	    	this.hdd=hdd;
	    	this.cpu=cpu;
	    }
		@Override
		public String getRAM() {
			return this.ram;
		}
		@Override
		public String getHDD() {
			return this.hdd;
		}
		@Override
		public String getCPU() {	
				return this.cpu;
		}
}
class ComputerFactory
{
	public static Computer getComputer(String type,String ram,String hdd,String cpu)
	{
//		if(type==null)
//		{
//			return null;
//		}
		if("PC".equalsIgnoreCase(type))
		{
			return new PC(ram,hdd,cpu);
		}
		else if("Server".equalsIgnoreCase(type))
		{
			return new Server(ram,hdd,cpu);
		}
		return null;
	}
}
public class MainFactoryClass {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter type,ram,hdd,cpu");
		String type=sc.nextLine();
		String ram=sc.nextLine();
		String hdd=sc.nextLine();
		String cpu=sc.nextLine();
//		ComputerFactory cf=new ComputerFactory();
		Computer pc=ComputerFactory.getComputer(type,ram, hdd, cpu);
		Computer server=ComputerFactory.getComputer(type, ram, hdd, cpu);
		System.out.println("Factory pattern of PC :"+pc);
		System.out.println("Factory pattern of Server :"+server);
	}

}
