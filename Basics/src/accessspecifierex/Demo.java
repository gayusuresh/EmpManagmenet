package accessspecifierex;

public class Demo 
{
	public  int x;
	public Demo()
	{
		x=12;
	}
	int display()
	{
		return x;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", display()=" + display() + "]";
	}
	

}
