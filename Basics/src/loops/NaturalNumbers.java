package loops;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int start=1;
		while(start<=n)//1<=5 2<=5 3<=5 4<=5 5<=5 6<=5=f
		{
			System.out.println(start);//1 2 3 4 5
           start++;//2,3 4 ,5,6
		}

	}

}
