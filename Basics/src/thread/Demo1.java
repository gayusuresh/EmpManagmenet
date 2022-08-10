package thread;

public class Demo1 implements Runnable
{
public void run()
{
	System.out.println("hai");
}
	public static void main(String[] args) {
		
		
		Demo1 d=new Demo1();
		Thread t=new Thread(d);
		t.start();


	}

}
