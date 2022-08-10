package exceptionhandling;

public class NumberFormatExample 
{
	public static void main(String[] args)
	{
		try
		{
		String s="hello";
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
