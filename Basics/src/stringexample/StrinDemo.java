package stringexample;

import java.util.Arrays;

public class StrinDemo {

	public static void main(String[] args) {
		String s="  HelloWord   ";
		char a[]=s.toCharArray();
		System.out.println(Arrays.toString(a));
		String s1="Java is object oriented";
		String word[]=s1.split(" ");
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}
		
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("d"));
		System.out.println(s.trim());
		System.out.println(s);

	}

}
