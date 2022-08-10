package inheritanceexample;

public class IndianBankMumbai extends IndianBank
{
public IndianBankMumbai()
{
	
}
public IndianBankMumbai(int accno,String name,int amount)
{
	super(accno, name, amount);
}
double withDraw()
{
	double withdraw=super.deposit-5000;
	return withdraw;
}
@Override
public String toString() {
	return super.toString()+"IndianBankMumbai [withDraw()=" + withDraw() + "]";
}

}
