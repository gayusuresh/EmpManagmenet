package loops;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int digit=0,evencount=0,oddcount=0;
		for(int num=sc.nextInt();num!=0;)//1234!=0 123!=0 12!=0 1!=0
		{
			digit=num%10;//1234%10=4 123%10=3 12%10=2
			if(digit%2==0)//4%2==0 3%2==0 2%2==0 1%2==0
			{
				evencount++;//2
				
			}
			else
			{
				oddcount++;//2
				
			}
			num=num/10;//1234/10=123 12/10 12/10=1
		}
		System.out.println("Odd count=:"+oddcount);
		System.out.println("Even count=:"+evencount);
	}

}
