package stringexample;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		System.out.println(s.stripLeading());
		System.out.println(s.stripTrailing());
		System.out.println(s.repeat(2));
		char a[]=new char[4];
	   s.getChars(0, 3, a, 0);
	   System.out.println(Arrays.toString(a));
	

	}

}
