package variablesanddatatypes;

import java.util.Scanner;

public class UsernameValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the username and password");
        String username=sc.next();
        String password=sc.next();
      System.out.println(username.equals("admin"));
      System.out.println(password.equals("123"));
	}

}
