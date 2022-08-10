package AbstractionTask;

public class Circle extends Shape
{
	private double radius;
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
    public Circle(String color,boolean filled,double radius)
    {
    	super(color, filled);
    	this.radius=radius;
    }
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
	
}
