package conditionalstatement;

import java.util.Scanner;

public class StudentInterviewEligible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the noofclassess held");
        int nch=sc.nextInt();
        System.out.println("noof classess attended");
        int nca=sc.nextInt();
        double percentage=(nca*100.0)/nch;
        if(percentage>=80)
        {
        	System.out.println("Allow to sit in exam as well as interview");
        }
        else
        {
        	System.out.println("not eligible for interview");
        }
	}

}
