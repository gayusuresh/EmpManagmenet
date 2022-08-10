package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		map.put(11, "horn");
		map.put(5, "Apple");
		map.put(2, "Bat");
		map.put(6, "Cat");
		map.put(1, "Dog");
		map.put(3, "Elephant");
		map.put(5, "Fish");
		map.put(7, "Goat");
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(11));
		System.out.println(map.containsValue("Goat"));
		System.out.println(map.get(2));
		System.out.println(map.hashCode());
	     map.remove(3);
	     System.out.println(map);
	    HashMap<Integer,String>map1=new HashMap<Integer,String>();
		  map1=(HashMap)map.clone();
		  System.out.println(map1);
		  Iterator it=map.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("================================");
		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<Integer,String>();
		lmap.put(11, "horn");
		lmap.put(5, "Apple");
		lmap.put(2, "Bat");
		lmap.put(6, "Cat");
		lmap.put(1, "Dog");
		lmap.put(3, "Elephant");
		lmap.put(5, "Fish");
		lmap.put(7, "Goat");
		System.out.println(lmap);
		for(Map.Entry<Integer, String>m:lmap.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		System.out.println("===========================================");
		TreeMap<Integer,String>tmap=new TreeMap<Integer,String>();
		tmap.put(11, "horn");
		tmap.put(5, "Apple");
		tmap.put(2, "Bat");
		tmap.put(6, "Cat");
		tmap.put(1, "Dog");
		tmap.put(3, "Elephant");
		tmap.put(5, "Fish");
		tmap.put(7, "Goat");
		System.out.println(tmap);
		for(Map.Entry<Integer, String>m:tmap.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		System.out.println("===============================");
		 System.out.println(map.entrySet());
		 System.out.println(map.values());
		 System.out.println(map.keySet());
		  
		

	}

}
