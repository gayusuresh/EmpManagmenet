package lambadaexpression;

public class Demo 
{
	
	public static void main(String[] args) 
	{
		int width=100;
    Drawable d=()->{
    	System.out.println(width);
    };
    d.draw();
	

	
	
		
	}

	

}
