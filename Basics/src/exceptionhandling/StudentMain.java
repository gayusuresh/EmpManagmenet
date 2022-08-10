package exceptionhandling;

public class StudentMain {

	public static void main(String[] args) throws Exception {
		Student s1=new Student(12,"anu",56,78,90,90,87);
		Student s2=new Student(13,"Raju",78,78,90,80,87);
		Student s3=new Student(14,"karthick",76,78,90,80,87);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		double max=s1.getPercentage();//80.2
		if(max<s2.getPercentage())//80.2<82.6
		{
			max=s2.getPercentage();//max=82.6
		}
		if(max<s3.getPercentage())//82.6<82.2
		{
			max=s3.getPercentage();
		}
		System.out.println("The Max percentage"+max+s2.getsName());
		if(max>=90)
		{
			System.out.println("it is high percentage");
		}
		else
		{
			throw new InvalidPercentageException("low percentage for interview");
		}

	}
	
	
}
