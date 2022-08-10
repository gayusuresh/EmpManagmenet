package variablesanddatatypes;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inches");
		int inches=sc.nextInt();
		double meters=inches*0.0234;
		System.out.println("The Meters =:"+meters);

	}

}
