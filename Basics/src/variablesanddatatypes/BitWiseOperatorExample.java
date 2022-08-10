package variablesanddatatypes;

public class BitWiseOperatorExample {

	public static void main(String[] args) {
		int x=35,y=11;
		int z=x&y;
		int z1=x|y;
		int z2=x^y;
		int z3=~x;
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		
		int c=8;
		int shift=c<<2;
		System.out.println(shift);

		int c1=8;
		int shift1=c1>>2;
		System.out.println(shift1);

	}

}
