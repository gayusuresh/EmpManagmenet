package classandobject;

public class Circle 
{
	int radius;
	
	
	Circle()
	{
		radius=23;
	}
	Circle(int i)//i=56
	{
		radius=i;//radius=56
	}
	double calculateArea()
	{
		return 3.14*radius*radius;
	}
	
	public String toString()
	{
		return "Radius="+radius+"AreaOFcircle=:"+calculateArea();
	}

}
