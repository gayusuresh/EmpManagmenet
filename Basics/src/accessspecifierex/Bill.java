package accessspecifierex;

public class Bill 
{
	private int billNumber;
	private int noofunits;
	private int costperunit;
	public Bill()
	{
		
	}
	public Bill(int billNumber,int noofunits,int costperunit)
	{
		this.billNumber=billNumber;
		this.noofunits=noofunits;
		this.costperunit=costperunit;
	}
	
	public void setBillNumber(int billNumber)
	{
		this.billNumber=billNumber;
	}
	public int getBillNumber()
	{
		return billNumber;
	}
	public void setNoofUnits(int noofunits)
	{
		this.noofunits=noofunits;
	}
	public int getNoofUnits()
	{
		return noofunits;
	}
	public void setCostperUnit(int costperunit)
	{
		this.costperunit=costperunit;
	}
	public int getCostperUnit()
	{
		return costperunit;
	}
	public double calculateBill()
	{
		return noofunits*costperunit;
	}
	@Override
	public String toString() {
		return "Bill [billNumber=" + billNumber + ", noofunits=" + noofunits + ", costperunit=" + costperunit
				+ ", calculateBill()=" + calculateBill() + "]";
	}
	

}
