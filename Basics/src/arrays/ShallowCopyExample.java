package arrays;

import java.util.Arrays;

public class ShallowCopyExample {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]=a;
		a[0]++;
		System.out.println(Arrays.toString(b));

	}

}
