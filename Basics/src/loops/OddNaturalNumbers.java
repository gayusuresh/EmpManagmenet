package loops;

import java.util.Scanner;

public class OddNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
         int n=sc.nextInt();//5
         int start=1;
         do
         {
        	 if(start%2!=0)//1%2!=0 2%2!=0 3%2!=0
        	 {
        	 System.out.println(start);//1,3,5
        	 }
        	 start++;//2,3
         }
         while(start<=n);//2<=5 3<=5
       

	}

}
