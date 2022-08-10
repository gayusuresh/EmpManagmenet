package loops;

public class BreakExample {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)//1==5 2==5 3==5 4==5 5==5
			{
				continue;
			}
			System.out.println(i);//1 2 3 4
		}
		

	}

}
