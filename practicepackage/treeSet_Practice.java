package practicepackage;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet_Practice
{
	public static void main(String[] args)
	{
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("tata");
		t1.add("redLabel");
		t1.add("3-roses");
		//t1.add(null); TreeSet maintains its elements in a sorted order, either by their natural 
		//ordering (if the elements implement Comparable) or by a custom Comparator provided during 
		//TreeSet creation. In either case, sorting requires comparing elements. When you try to add null,
		//the TreeSet attempts to compare null with existing elements or with itself (if it's the first element). 
		t1.add("tata");
		
		
		System.out.println(t1.hashCode());
		System.out.println(t1.size());
		Iterator<String> i1 = t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		Iterator<String> desc_iterator = t1.descendingIterator();
		while(desc_iterator.hasNext())
		{
			System.out.println(desc_iterator.next());
		}
		
		t1.clear();
	}
}
