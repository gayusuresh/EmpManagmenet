package variablesanddatatypes;

import java.util.Scanner;

public class ArithmeticExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two input");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int addtion=num1+num2;
		int subtraction=num1-num2;
		int product=num1*num2;
		double division=(double)num1/num2;
		double mod=num1%num2;
		System.out.println("Addtion=:"+addtion);
		System.out.println("Subtraction=:"+subtraction);
		System.out.println("Product=:"+product);
		System.out.println("Division=:"+division);
		System.out.println("Modulo=:"+mod);
	}

}
