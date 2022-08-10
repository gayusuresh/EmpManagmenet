package arrays;

public class SampleArrayCopy {

	public static void main(String[] args) {
		int original[]= {12,13,14,15};
		int copy[]=original.clone();
            for(int i=0;i<copy.length;i++)
            {
            	System.out.println(copy[i]);
            }
		

	}

}
