package inheritanceexample;

public class Class10Practicalmarks extends Class10 
{
	int sciencepra,mathspra;
	 public Class10Practicalmarks() {
		
	
		
	}
	public Class10Practicalmarks(int id,String name,String address,int m1,int m2,int m3,int m4,int m5,int sciencpra,int mathspra)
	{
	 super(id, name, address, m1, m2, m3, m4, m5);
	 this.sciencepra=sciencpra;
	 this.mathspra=mathspra;
	}
	public int getSciencepra() {
		return sciencepra;
	}
	public void setSciencepra(int sciencepra) {
		this.sciencepra = sciencepra;
	}
	public int getMathspra() {
		return mathspra;
	}
	public void setMathspra(int mathspra) {
		this.mathspra = mathspra;
	}
	@Override
	public String toString() {
		return  super.toString()+"Class10Practicalmarks [sciencepra=" + sciencepra + ", mathspra=" + mathspra + "]";
	}
	

}
