package conditionalstatement;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sid");
		int sid=sc.nextInt();
		System.out.println("enter the sName");
		String sname=sc.next();
		System.out.println("enter Student marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int total=m1+m2+m3+m4+m5;
		double percentage=(total*100)/500.0;
		System.out.println("The Student id=:"+sid);
		System.out.println("The Student Name=:"+sname);
		
		System.out.println("The percentage=:"+percentage);
		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=80 && percentage<90)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=70 && percentage<80)
		{
			System.out.println("Grade c");
		}

		else if(percentage>=60 && percentage<70)
		{
			System.out.println("Grade D");
		}
		else if(percentage<60)
		{
			System.out.println("Not Eligible for Interview");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
