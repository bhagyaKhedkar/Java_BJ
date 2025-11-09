package practicepackage;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


public class Collection_Practice
{
	public static void main(String[] args) 
	{
		/*ArrayList<String> a1 = new ArrayList<>();
		//a1.add(12);
		a1.add("Bhagya");
		a1.add(0, "Study");
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.add(15);
		a2.add("adhvik");
		a2.add(0, "Goal");
		System.out.println(a2);
		a1.addAll(a2);
		
		//a1.remove("Bhagya");
		System.out.println(a1);
		System.out.println(a1.equals(a2));
		System.out.println(a2.size());
		a1.removeAll(a2);
		System.out.println(a2);
		System.out.println(a1);*/
		Map <Integer , String> m1 = new HashMap<>();
		m1.put(1, "Bhagya");
		m1.put(2, "Akshay");
		m1.put(3, "Adhvik");
		
		for(Integer i1:m1.keySet())
		{
			System.out.println(i1);
		}
		for(String s1 : m1.values())
		{
			System.out.println(s1);
		}
		for(Map.Entry<Integer,String> e1: m1.entrySet())
		{
			Integer key = e1.getKey();
			String Value = e1.getValue();
			System.out.println(key +" "+ Value);
		}
		
		Iterator<Map.Entry<Integer, String>> i1=m1.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		
	}}