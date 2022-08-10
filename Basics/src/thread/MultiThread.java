package thread;

public class MultiThread {

	public static void main(String[] args)
	{
		Customer c=new Customer();
		First f=new First(c);
		
		f.start();
		
	
		Second s=new Second(c);
		
		s.start();
		
	}

}
