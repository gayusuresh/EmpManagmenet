package classandobject;

public class MobileMain {

	public static void main(String[] args) {
		Mobile samsung=new Mobile();
		samsung.ram=4;
		samsung.rom=64;
		samsung.color="black";
		samsung.os="snapdragon";
		System.out.println(samsung.ram);
		System.out.println(samsung.rom);
		System.out.println(samsung.color);
		System.out.println(samsung.os);
		samsung.communication();
		samsung.Browsing();
		Mobile realme=new Mobile();
		realme.ram=8;
		realme.rom=64;
		realme.color="red";
		realme.os="android";
		realme.communication();
		realme.Browsing();
		System.out.println(realme.ram);
		System.out.println(realme.rom);
		System.out.println(realme.color);
		System.out.println(realme.os);
		
		System.out.println(samsung instanceof Mobile);
	
	}

}
