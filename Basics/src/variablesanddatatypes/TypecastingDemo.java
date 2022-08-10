package variablesanddatatypes;

public class TypecastingDemo {

	public static void main(String[] args) {
		int i=45;//4 bytes
		double j=i;//8 bytes
		System.out.println(i);
		System.out.println(j);
		double k=90.8;//8 bytes
		int l=(int)k;//4 bytes
	}

}
