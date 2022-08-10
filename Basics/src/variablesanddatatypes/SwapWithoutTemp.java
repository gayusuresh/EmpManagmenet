package variablesanddatatypes;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int a=sc.nextInt();//3
		int b=sc.nextInt();//4
		System.out.println("Before"+a);
		System.out.println("Before"+b);
		/*
		 * a=a+b ;//3+4=7 b=a-b;//7-4=3; a=a-b;//7-3=4
		 */		
		a=a*b;//3*4=12
		b=a/b;// 12/4=3
		a=a/b;//12/3=4
		System.out.println("After"+a);
		System.out.println("After"+b);

	}

}
