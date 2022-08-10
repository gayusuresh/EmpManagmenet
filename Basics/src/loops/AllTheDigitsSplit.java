package loops;
//input:123 :3 2 1
import java.util.Scanner;

public class AllTheDigitsSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();//123
        int digit=0;
        while(num!=0)//123!=0 12!=0 1!=0
        {
        	digit=num%10;//123%10=3 12%10=2 1%10=1
        	   System.out.println(digit);//3,2,1
        	num=num/10;//123/10=12 12/10=1 
        	
        }
     
        

	}

}
