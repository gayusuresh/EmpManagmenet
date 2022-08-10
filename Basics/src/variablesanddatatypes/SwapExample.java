package variablesanddatatypes;
//swap with third variable
import java.util.Scanner;

public class SwapExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		int a=sc.nextInt();//3
		int b=sc.nextInt();//4
		System.out.println("The Before Swapping a=:"+a);
	    System.out.println("The before Swapping b=:"+b);
		int temp=a;//3
	    a=b;//a=4
	    b=temp;//b=3
	    System.out.println("The After Swapping a=:"+a);
	    System.out.println("The After Swapping b=:"+b);
	}

}
