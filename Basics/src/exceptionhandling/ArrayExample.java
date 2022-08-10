package exceptionhandling;

public class ArrayExample {

	public static void main(String[] args)
	{
		try
		{
		int a[]= {12,34,56,78};
		System.out.println(a[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
