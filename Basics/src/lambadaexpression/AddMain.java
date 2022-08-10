package lambadaexpression;

public class AddMain {
      
	public static void main(String[] args) {
		Addable a=(int x,int y)->{
			System.out.println(x+y);
		};
		a.add(3, 6);
	}
}
