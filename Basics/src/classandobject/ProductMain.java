package classandobject;

public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product(1001,"chair",89);
		
		System.out.println(p1);
		
     Product p2=new Product(1002,"KidsChair",189);
		
		System.out.println(p2);
     Product p3=new Product(1003,"TableMate",99);
		
		System.out.println(p3);
		 Product p4=new Product();
			p4.id=1004;
			p4.name="shopa";
			System.out.println(p4.id);
			System.out.println(p4.name);

	}

}
