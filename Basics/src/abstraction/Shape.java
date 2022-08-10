package abstraction;

public abstract  class Shape 
{
	public abstract double calculateArea();
	
	public void display()//non abstract method
	{
		System.out.println("hello");
	}
	public static void display1()//non abstract method
	{
		System.out.println("hello");
	}
}
