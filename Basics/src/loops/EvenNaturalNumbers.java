package loops;

import java.util.Scanner;

public class EvenNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//5
		int start=1;
		while(start<=n)//1<=5 2<=5 3<=5 4<=5 5<=5 6<=5=f
		{
			if(start%2==0)//1%2==0=f 2%2==0 3%2==0 4%2==0 5%2==0=f
			{
				System.out.println(start);//2,4
			}
			start++;//2,3,4,5,6
		}
	}

}
