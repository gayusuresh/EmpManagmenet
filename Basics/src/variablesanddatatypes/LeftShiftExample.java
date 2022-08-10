package variablesanddatatypes;

public class LeftShiftExample {

	public static void main(String[] args) {
		int x=8;
		int z=x<<2;
		System.out.println(z);
	}
/*2==>0010
 * 1000
left shift means u have to remove left side 2 zero
  in that time 10 u have to componsate 4 bytes  again add two
  more zero in right side 1000=>now we get 1000=>decimal value of 0100
  is equal to 8*/
}
