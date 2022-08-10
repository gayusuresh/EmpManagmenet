package inheritanceexample;

public class IndianBank extends Bank
{
	private int amount;
	
	public IndianBank()
	{
		
	}
	public IndianBank(int accno,String name,int amount)
	{
		super(accno, name);
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	double deposit;
	double deposit()
	{
		deposit=amount+10000;
		return deposit;
	}
	@Override
	public String toString() {
		return super.toString()+"IndianBank [amount=" + amount + ", deposit()=" + deposit() + "]";
	}
	

}
