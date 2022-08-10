package variablesanddatatypes;
//speed formula=speed=distance/time
import java.util.Scanner;

public class SpeedExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int distance=sc.nextInt();
		int time =sc.nextInt();
		double speed=(double)distance/time;
		System.out.println("The Speed is "+speed);

	}

}
