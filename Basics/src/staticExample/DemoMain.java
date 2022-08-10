package staticExample;

public class DemoMain {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.acc();//13
		Demo d1=new Demo();
		d1.acc();//13
		Demo d2=new Demo();
		d2.acc();//13
		Demo.display();//classname.methodname
		acc();
		
	}
	
	public static void acc()
	{
		System.out.println("jjj");
	}

}
