package variablesanddatatypes;

import java.util.Scanner;

public class FiveDigitExample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();//78965
	//?true:false
	String result=((n>=10000)&&(n<99999))?"Five digit number":
		"Not Five digit number";
	System.out.println(result);

	}

}
