package com.design.patterns;

import java.util.Scanner;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory factory=new ShapeFactory();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter shapename");
		String shapeName=sc.nextLine();
		Shape shape=factory.getShape(shapeName);
		shape.draw();
	}
}
interface Shape
{
	public void draw();
	
}
class Circle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Draw the shape of circle");
	}
}
class Rectangle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Draw the shape of Rectangle");
	}
}
class Square implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Draw the shape of Square");
	}
}
class ShapeFactory
{
	public Shape getShape(String shape)
	{
		if(shape==null)
		{
			return null;
		}
		if(shape.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("square"))
		{
			return new Square();
		}
		else
		{
			return null;
		}
	}
}
