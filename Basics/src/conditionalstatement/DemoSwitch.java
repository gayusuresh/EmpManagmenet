package conditionalstatement;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		int month=sc.nextInt();
		switch(month)//7
		{
		case 1:System.out.println("Jan");
		break;
		case 2:System.out.println("Feb");
		break;
		case 3:System.out.println("Mar");
		break;
		case 4:System.out.println("Apr");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("july");
		break;
		default:System.out.println("the output not match");

		}

	}

}
