package loops;

public class LeftTriangle {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//1<=5 2<=5 3<=5 4<=5 5<=5
		{
			for(int j=1;j<=i;j++)//1<=1 2<=1=f
			{                     //1<=2 2<=2 3<=2=f
				                   //1<=3 2<=3 3<=3 4<=3
			                       //1<=4 2<=4 3<=4 4<=4 5<=4=f
				                   //1<=5 2<=5 3<=5 4<=5 5<=5
				System.out.print(i);//*
				                     //**
				                    //***
				                    //****
				                   //******
			}
			System.out.println();
		}
	}

}
