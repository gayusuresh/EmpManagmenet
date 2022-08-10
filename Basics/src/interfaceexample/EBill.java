package interfaceexample;

public class EBill implements Bill
{
	private int billno;
	private int noofunit;
	private int costperunit;
	public EBill()
	{
		
	}
	public EBill(int billno,int noofunit,int costperunit)
	{
		this.billno=billno;
		this.noofunit=noofunit;
		this.costperunit=costperunit;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public int getNoofunit() {
		return noofunit;
	}
	public void setNoofunit(int noofunit) {
		this.noofunit = noofunit;
	}
	public int getCostperunit() {
		return costperunit;
	}
	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}
	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return noofunit*costperunit;
	}
	@Override
	public void display() {
		System.out.println("EBILL=:"+calculateBill());
		
	}
	@Override
	public String toString() {
		return "EBill [billno=" + billno + ", noofunit=" + noofunit + ", costperunit=" + costperunit + "]";
	}

	
}
