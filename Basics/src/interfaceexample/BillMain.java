package interfaceexample;

public class BillMain {

	public static void main(String[] args) {
		EBill e=new EBill(1234,56,78);
		System.out.println(e);
		e.display();
		WBill w=new WBill(2345,23,89);
		System.out.println(w);
		w.display();
		Bill.acc();
	}

}
