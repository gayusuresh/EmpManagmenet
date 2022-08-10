package variablesanddatatypes;

import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String Name=sc.next();
		System.out.println(Name.charAt(2));

	}

}
