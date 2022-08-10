package loops;

public class NestedLoopdemo {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//outer for loop   i=1 1<=3 2<=3 3<=3 4<=3=f
		{
			for(int j=1;j<=3;j++)//inner for loop j=1 1<=3 2<=3 3<=3 4<=3=f
			{
				System.out.print(j);//* * *
				                       //* * *
				                       //* * *
			}
			System.out.println();//nextline
		}

	}

}
