package loops;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int num=sc.nextInt();
       int start=1;
       int fact=0;
     //1<=3 2<=3 3<=3
       do
      {
    	  if(num%start==0)//3%1==0 3%2==0 3%3==0
    	  {
    		  System.out.println(start);//1,3
    		  fact++;//2
    	  }
    	  start++;//2,3
      }
      while(start<=num);
      if(fact==2)
      {
    	  System.out.println("prime number");
      }
      else
      {
    	  System.out.println("composite number");
      }
	}

}
