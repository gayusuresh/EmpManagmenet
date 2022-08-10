package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		p.add(1000);
		p.add(1001);
		p.add(1002);
		p.add(1003);
		p.add(1004);
		p.add(1005);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.remove());
		System.out.println(p.element());
		System.out.println(p);
		Iterator<Integer>it=p.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
