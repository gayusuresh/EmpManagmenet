package overridingdifferentPackage;

import overridingExample.Bird;

public class Demo extends Bird
{
	public void fly()
	{
		System.out.println("i can't fly");
	}
}
