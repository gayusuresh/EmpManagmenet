package lambadaexpression;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(23);
		list.add(67);
		list.add(78);
		list.add(56);
		list.add(123);
		for(Integer i:list)
		{
			System.out.println(i);
		}
		//lambada
		list.forEach((n)->System.out.println(n));
		
	}

}
