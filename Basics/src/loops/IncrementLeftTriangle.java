package loops;

public class IncrementLeftTriangle {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=3;i++)//1<=3 2<=3 3<=3
		{
			for(int j=1;j<=i;j++)//1<=1 2<=1=f
				                 //1<=2 2<=2 3<=2
				                //1<=3 2<=3 3<=3 4<=3=f
			{
				System.out.print(num);//1
				                      //2 3
				                     //4 5 6
				num++;//2,3,4
			}
			System.out.println();
		}

	}

}
