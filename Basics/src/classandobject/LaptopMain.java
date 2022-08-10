package classandobject;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop lenova=new Laptop();
		lenova.ram=4;
		lenova.rom=64;
		lenova.processor="i3";
		lenova.os="snapdragon";
		System.out.println("The Ram=:"+lenova.ram);
		System.out.println("The Rom=:"+lenova.rom);
		System.out.println("Processor=:"+lenova.processor);
		System.out.println("Os=:"+lenova.os);
		lenova.communication();
		lenova.Browsing();

	}

}
