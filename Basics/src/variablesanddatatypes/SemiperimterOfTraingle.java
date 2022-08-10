package variablesanddatatypes;

import java.util.Scanner;

/*semiperimeter of triangle=>  s=(a+b+c)/2*/
public class SemiperimterOfTraingle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double semiperimeter=(a+b+c)/2;
		System.out.println("The Semiperimeter of Triangle is=:"+semiperimeter);
   
	}

}
