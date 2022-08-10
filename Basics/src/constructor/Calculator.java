package constructor;

public class Calculator 
{
	int x;
	int y;
	 Calculator() //no argument
	{
		
	}
	 Calculator(int i,int j)
	{
		x=i;
		y=j;
	}
	int add()
	{
		int sum=x+y;
		return sum;
	}
	int sub()
	{
		int sub=x-y;
		return sub;
	}
	int mul()
	{
		int mul=x*y;
		return mul;
		
	}
    int div()
    {
    	int div=x/y;
    	return div;
    }
	@Override
	public String toString() {
		return "Calculator [x=" + x + ", y=" + y + ", add()=" + add() + ", sub()=" + sub() + ", mul()=" + mul()
				+ ", div()=" + div() + "]";
	}
    
}
