package variablesanddatatypes;

import java.util.Scanner;

public class DefaultValueExample {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
	    int a=sc.nextInt();
	    int b = 0;
	    double c = 0.0;
	    System.out.println("The A=:"+a);
	    System.out.println("The B=:"+b);
	    System.out.println("The C=:"+c);
	    byte x=127;
        byte y=65;
        byte z=70;
        System.out.println((char)y);
        System.out.println((char)z);
	}

}
