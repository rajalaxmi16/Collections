package com.design.patterns;

import java.util.Scanner;

abstract class AbstractFactory
{
   public abstract Shape1 getShape(String shapeType);	
}
class FactoryProducer
{
	public static AbstractFactory getFactory(boolean rounded)
	{
		if(rounded)
		{
			return new RoundedShapeFactory();
		}
		else
		{
			return new ShapeFactory1();
		}
	}
}
class ShapeFactory1 extends AbstractFactory
{
	@Override
	public Shape1 getShape(String shapeType)
	{
		if(shapeType.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle1();
		}
		else if(shapeType.equalsIgnoreCase("Square"))
		{
			return new Square1();
		}
		return null;
	}
}
class RoundedShapeFactory extends AbstractFactory
{
	@Override
	public Shape1 getShape(String shapeType)
	{
		if(shapeType.equalsIgnoreCase("RoundedRectangle"))
		{
			return new RoundedRectangle();
		}
		else if(shapeType.equalsIgnoreCase("RoundedSquare"))
		{
			return new RoundedSquare();
		}
		return null;
	}
}
interface Shape1
{
	public void draw();
}
class Rectangle1 implements Shape1
{
	@Override
	public void draw()
	{
		System.out.println("This is Rectangle::draw()");
	}
}
class Square1 implements Shape1
{
	@Override
	public void draw()
	{
		System.out.println("This is Square::draw()");
	}
}
class RoundedRectangle implements Shape1
{
	@Override
	public void draw()
	{
		System.out.println("This is RoundedRectangle :: draw()");
	}
}
class RoundedSquare implements Shape1
{
	@Override
	public void draw()
	{
		System.out.println("This is RoundedSquare :: draw()");
	}
}
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
	
		AbstractFactory shapeFactory=FactoryProducer.getFactory(false);
		Shape1 shape1=shapeFactory.getShape("Rectangle");
		shape1.draw();
		Shape1 shape2=shapeFactory.getShape("Square");
		shape2.draw();
		AbstractFactory shapeFactory1=FactoryProducer.getFactory(true);
		Shape1 shape3=shapeFactory1.getShape("RoundedRectangle");
		shape3.draw();
		Shape1 shape4=shapeFactory1.getShape("RoundedSquare");
		shape4.draw();
		
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter ShapeFactory");
//       String factory=sc.nextLine();
//       System.out.println("Enter Shape");
//       String type=sc.nextLine();
      
	}

}
