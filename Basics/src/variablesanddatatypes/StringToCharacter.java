package variablesanddatatypes;

import java.util.Scanner;

public class StringToCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String Name=sc.next();//jack
		char a[]=Name.toCharArray();
		System.out.println(a[0]);//J
		System.out.println(a[1]);//A
		System.out.println(a[2]);//V
		System.out.println(a[3]);//A
		System.out.println((byte)a[0]+a[1]+a[2]+a[3]);
	}

}
