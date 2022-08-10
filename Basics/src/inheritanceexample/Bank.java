package inheritanceexample;

public class Bank 
{
	private int accno;
	private String name;
	public Bank()
	{
		
	}
	public Bank(int accno,String name)
	{
		this.accno=accno;
		this.name=name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + "]";
	}
	
	

}
