package arrays;

import java.util.Scanner;

public class TwoDimentionalArrayEx {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();
		System.out.println("enter the col");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("enter the inputs");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)//0<2 1<2
		{
			for(int j=0;j<row;j++)//0<2 1<2 2<2=f
			{
				System.out.print(a[i][j]+" ");//a[0][0]=13 a[0][1]=14
				                              //a[1][0]=15  a[1][1]=16;
			}
			System.out.println();
		}

	}

}
