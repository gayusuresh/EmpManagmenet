package variablesanddatatypes;

import java.util.Scanner;

public class UpperCaseExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String Name=sc.next();
		System.out.println(Name.toUpperCase());

	}

}
