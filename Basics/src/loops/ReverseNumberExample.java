package loops;

import java.util.Scanner;

public class ReverseNumberExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();//123
        int digit=0,rev=0;
        while(num!=0)//123!=0 12!=0 1!=0 0==0=f
        {
        	digit=num%10;//123%10=3 12%10=2  1%10=1
        	rev=(rev*10)+digit;//rev=0*10=0+3=3 rev=3*10=30+2=32
        	//rev=32*10=320+1=321
        	
        	num=num/10;//123/10=12 12/10=1 0
        }
        System.out.println(rev);//321
	}

}
