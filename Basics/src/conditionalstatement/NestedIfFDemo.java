package conditionalstatement;

public class NestedIfFDemo {

	public static void main(String[] args) {
		int i=5,j=10;
		if(i<=j)//5<=10
		{
			if(i==j)//5==10
			{
				System.out.println("i value  equal to j");
			}
			else
			{
				System.out.println("i value not equals j");
			}
		}
		else
		{
			System.out.println("i value not less than as well as not equal");
		}

	}

}
