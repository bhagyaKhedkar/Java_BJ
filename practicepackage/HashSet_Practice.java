package practicepackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Practice 
{
	public static void main(String[] args)
	{
		HashSet<String> studentSet = new HashSet<String>();
		studentSet.add("navi");
		studentSet.add("peni");
		
		studentSet.remove("navi");
		studentSet.add("gini");
		studentSet.add("mini");
		studentSet.add("mini");
		studentSet.add(null);
		studentSet.add(null);
		System.out.println(studentSet);
		Iterator<String> l1 = studentSet.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		
	}
}
