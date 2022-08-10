package stringexample;

public class BufferExample {

	public static void main(String[] args) {
	  StringBuilder s=new StringBuilder("HelloWorld");
	  
	  System.out.println(s);
	  s.append("hai");
	  System.out.println(s);
	  s.insert(3,"welcome");
	  System.out.println(s);
	 s.replace(0, 3, "Java");
	 System.out.println(s);
	 s.delete(1, 5);
	 System.out.println(s);
	 s.reverse();
	 System.out.println(s);
	}

}
