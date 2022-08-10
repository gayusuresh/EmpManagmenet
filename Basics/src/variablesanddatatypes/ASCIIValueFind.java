package variablesanddatatypes;

import java.util.Scanner;

public class ASCIIValueFind {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabet");
	    char alphabet=sc.next().charAt(0);//H
	    System.out.println((byte)alphabet);

	}

}
