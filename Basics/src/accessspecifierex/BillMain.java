package accessspecifierex;

public class BillMain {

	public static void main(String[] args) {
		Bill ebbil=new Bill(12345,56,100);
		System.out.println(ebbil);
		Bill ebill1=new Bill();
		ebill1.setBillNumber(4567);
		ebill1.setNoofUnits(345);
		System.out.println(ebill1.getBillNumber());
		System.out.println(ebill1.getNoofUnits());
		

	}

}
