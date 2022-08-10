package thread;

public class Second extends Thread
{
	Customer c;
	Second(Customer c)
	{
		this.c=c;
	}
	public void run()
	{
		c.deposit(20000);
		
	}

}
