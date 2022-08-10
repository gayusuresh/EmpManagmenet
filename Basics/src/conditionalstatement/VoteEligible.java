package conditionalstatement;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Welcome to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		
       sc.close();
	}

}
