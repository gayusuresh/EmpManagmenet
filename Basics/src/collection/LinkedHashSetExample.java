package collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("hai");
		set.add("hello");
		set.add("welcome");
		set.add("hai");
		set.add("jack");
		System.out.println(set);
		
		

	}

}
