package thread;

public class First extends Thread
{
	Customer c;
	public First(Customer c)
	{
		this.c=c;
	}
	public void run()
	{
		c.withDraw(15000);
		
	}

}
