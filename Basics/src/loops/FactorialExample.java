package loops;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int n=sc.nextInt();//5
		int fact=1;int start=1;
		do
		{
			fact=fact*start;//fact=1*1 fact=1*2=2
			//fact=2*3=6 fact=6*4=24 24*5=120
			
			start++;//2,3,4,5
		}
		while(start<=n);//2<=5 3<=5 4<=5 5<=5
		System.out.println(fact);
	}

}
