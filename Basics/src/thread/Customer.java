package thread;

import javax.sql.rowset.spi.SyncResolver;

public class Customer 
{
	int amount=10000;
	public synchronized void withDraw(int amount)
	{
		System.out.println("less amount wait for deposit");
		try
		{
		wait();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		double withdraw=this.amount-amount;
		System.out.println("The Withdraw amount is=:"+withdraw);
	}
	public synchronized void deposit(int amount)
	{
		int deposit=this.amount+amount;
		System.out.println("The amount deposited");
		notify();
	}
	

}
