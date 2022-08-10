package conditionalstatement;

import java.util.Scanner;

public class FiveDigitNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		if(number>=10000 && number<=99999)
		{
			System.out.println("Five Digit number");
		}
		
		else
		{
			System.out.println("Not a five digit number");
		}


	}

}
