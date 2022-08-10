package classandobject;

public class Student 
{
	int sId;
	String sName;
	int m1,m2,m3,m4,m5;
	void percentage()
	{
		int total=m1+m2+m3+m4+m5;
		double percentage=(total*100)/500;
		System.out.println("The Percentage=:"+percentage);
	}

}
