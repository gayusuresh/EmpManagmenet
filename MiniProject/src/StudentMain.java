import java.util.Scanner;

public class StudentMain 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Add student data");
		
		     new StudentAdd().addData();
		break;	
		}
	}

}
