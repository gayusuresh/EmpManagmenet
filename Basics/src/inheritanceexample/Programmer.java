package inheritanceexample;

public class Programmer extends Employee
{
	int pf;
	String address;
	public Programmer()
	{
		
	}
	public Programmer(int eId,String eName,float salary,int pf,String address)
	{
		seteId(eId);
		seteName(eName);
		setSalary(salary);
		this.pf=pf;
		this.address=address;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return super.toString()+ "Programmer [pf=" + pf + ", address=" + address + "]";
	}
	

}
