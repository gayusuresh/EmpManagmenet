package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(1001);
		list.add(1002);
		list.add(1003);
		list.add(1004);
		list.add(1005);
		list.add(1001);
		System.out.println(list);
		list.addFirst(1000);
		list.addLast(1006);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		list.add(0, 1000);
		System.out.println(list);
		System.out.println(list.contains(1000));
		list.add(1001);
		list.add(1002);
		list.add(1003);
		list.add(1004);
		list.add(1005);
		list.add(1001);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println("next data");
		ListIterator< Integer>it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	System.out.println("previous data");	
	
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}

	}

}
