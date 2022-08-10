package conditionalstatement;

import java.util.Scanner;

public class ArithmeticExampleUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		System.out.println("enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result;
		switch(choice)
		{
		case 1:
			result=a+b;
			System.out.println("The Sum =:"+result);
			break;
		   case 2:
			   result=a-b;
			System.out.println("The subtraction =:"+result);
			break;
			
		case 3:
			 result=a*b;
			System.out.println("The multiplication =:"+result);
			break;
			
		case 4:
			 result=a/b;
			System.out.println("The Division =:"+result);
			break;
			default:
			System.err.println("doesnot match the choice");
			
		}
	}

}
