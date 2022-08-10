package conditionalstatement;

import java.util.Scanner;

public class LeapYearAnotherLogic {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if(year%4==0)//1900%4==0 t
		{
			if(year%100==0)//1900%100==0 t
			{
				if(year%400==0)//1900%400==f
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not leap year");
				}
			}
			else
			{
			System.out.println("not a century year");
			}
		}
		else
		{
			System.out.println("not leap year");
		}

	}

}
