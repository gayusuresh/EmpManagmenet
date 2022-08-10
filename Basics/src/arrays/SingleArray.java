package arrays;

import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];//5
		System.out.println("enter the inputs");
		for(int i=0;i<size;i++)//0<5 1<5 2<5 3<5 4<5
		{
		a[i]=sc.nextInt();
		//a[0]=1 a[1]=2 a[2]=3 a[3]=4 a[4]=5
		}
		System.out.println("outputs");
		for(int i=0;i<size;i++)//0<5 1<5
		{
			System.out.println(a[i]);//a[0]=1 a[1]=2
		}
		

	}

}
