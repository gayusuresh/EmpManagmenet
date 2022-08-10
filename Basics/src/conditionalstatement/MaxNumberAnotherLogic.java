package conditionalstatement;

import java.util.Scanner;

public class MaxNumberAnotherLogic {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("enter the three inputs");
		   int a=sc.nextInt();//2
		   int b=sc.nextInt();//5
		   int c=sc.nextInt();//4
		   int max=a;//max=2
		   if(max<b)//2<5
		   {
			   max=b;//max=5
		   }
		   if(max<c)//5<4=f
		   {
			   max=c;
		   }
		   System.out.println("The Max is=:"+max);//5
			   

	}

}
