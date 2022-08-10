package stringexample;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence=sc.nextLine();
		String word[]=sentence.split(",");
		int count=word.length;
		System.out.println("The word Count =:"+count);
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		}

	}

}
