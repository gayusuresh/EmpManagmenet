package methods;

public class CalculateAreaExample {

	public void calculateArea(int radius)
	{
		
		double area=3.14*radius*radius;
		System.out.println("The Area of Circle is=:"+area);

	}
	public void calculateArea(int length,int width)
	{
		
		double area=length*width;
		System.out.println("The Area of Rectengle is=:"+area);

	}
	public void calculateArea(int side1,int side2,int side3)
	{
		int s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*s-side3);
		System.out.println("The areaof triangle is=:"+area);
	}

}
