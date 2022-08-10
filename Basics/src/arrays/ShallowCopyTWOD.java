package arrays;

import java.util.Arrays;

public class ShallowCopyTWOD {

	public static void main(String[] args)
	{
		int a[][]= {{1,1},{2,2}};
		/*a[0][0]=1;
		a[0][1]=1;
		a[1][0]=2;
		a[1][1]=2;*/
		int b[][]=a.clone();
		a[0][0]++;
		
		for(int i=0;i<b.length;i++)//0<2 1<2
		{
			for(int j=0;j<b.length;j++)//0<2 1<2 2<2=f
				                       //0<2
			{
			System.out.println(b[i][j]);//b[0][0]=1 b[0][1]=1
			                           //b[1][0]=2 b[1][1]=2
			}
		}

	}

}
